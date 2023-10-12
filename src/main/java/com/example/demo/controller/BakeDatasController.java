package com.example.demo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.BakeDatas;
import com.example.demo.service.IBakeDatasService;
import com.example.demo.vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@Api(value = "bakedata接口", tags = {"bakedata接口"})
@RequestMapping("/bakedatas")
public class BakeDatasController {
    @Autowired
    private IBakeDatasService bakedatasService;


    @ApiOperation("查询列表")
    @GetMapping("/list")
    public Result<?> findPage(@RequestParam(defaultValue = "1") Integer pageNo,
                              @RequestParam(defaultValue = "10") Integer pageSize) {

        Page<BakeDatas> page = new Page<>(pageNo, pageSize);
        Page<BakeDatas> list = bakedatasService.page(page);
        return Result.OK(list);

    }

    @ApiOperation("新增")
    @PostMapping("/add")
    public Result<?> addBakeDatas(@RequestBody BakeDatas bakedata) {
        boolean flag = bakedatasService.save(bakedata);
        return Result.OK(flag);
    }

    @ApiOperation("修改")
    @PostMapping("/update")
    public Result<?> updateBakeDatas(@RequestBody BakeDatas bakedata) {
        boolean flag = bakedatasService.updateById(bakedata);
        return Result.OK(flag);
    }

    @ApiOperation("删除")
    @PostMapping("/delete")
    public Result<?> deleteBakeDatas(@RequestBody BakeDatas bakedata) {
        boolean flag = bakedatasService.removeById(bakedata.get_id());
        return Result.ok(flag);
    }

}
