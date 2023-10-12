package com.example.demo.controller;

import com.example.demo.mapper.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.vo.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(value = "用户接口1", tags = {"用户接口1"})
@RequestMapping("/user")
public class UserController {
    @Resource
    UserMapper userMapper;

    @ApiOperation("获取用户列表")
    @GetMapping
    public List<User> getUser() {
        return userMapper.findAll();
    }

    @PostMapping("/add")
    @ApiOperation("新增用户")
    public String addUser(@RequestBody User user) {
        userMapper.save(user);
        return "success";
    }

    @PutMapping
    public String updateUser(@RequestBody User user) {
        userMapper.updateById(user);

        return "success";
    }

    @GetMapping("/{id}")
    public User findByid(@PathVariable("id") Long id) {


        return userMapper.findByid(id);

    }

    @GetMapping("/page")
    public Page<User> findPage(@RequestParam(defaultValue = "1") Integer pageNum,
                               @RequestParam(defaultValue = "10") Integer pageSize) {
        pageNum = pageNum - 1;
        Integer offset = pageNum * pageSize;
        List<User> userData = userMapper.findPage(pageNum, pageSize);
        Page<User> page = new Page<>();
        page.setData(userData);

        Integer total = userMapper.countUser();
        page.setTotal(total);
        page.setPageNum(pageNum);
        page.setPageSize(pageSize);

        return null;

    }

}
