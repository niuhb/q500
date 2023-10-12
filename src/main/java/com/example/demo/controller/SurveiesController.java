package com.example.demo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.Surveies;
import com.example.demo.service.ISurveiesService;
import com.example.demo.vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@Api(value = "Surveies接口", tags = {"Surveies接口"})
@RequestMapping("/surveies")
public class SurveiesController {
    @Autowired
    private ISurveiesService surveiesService;

    @ApiOperation("查询列表")
    @GetMapping("/list")
    public Result<?> findPage(@RequestParam(defaultValue = "1") Integer pageNo,
                              @RequestParam(defaultValue = "10") Integer pageSize) {

        Page<Surveies> page = new Page<>(pageNo, pageSize);
        Page<Surveies> list = surveiesService.page(page);
        return Result.OK(list);

    }

    @ApiOperation("新增")
    @PostMapping("/add")
    public Result<?> addSurveies(@RequestBody Surveies surveie) {
        boolean flag = surveiesService.save(surveie);
        return Result.OK(flag);
    }

    @ApiOperation("修改")
    @PostMapping("/update")
    public Result<?> updateSurveies(@RequestBody Surveies surveie) {
        boolean flag = surveiesService.updateById(surveie);
        return Result.OK(flag);
    }

    @ApiOperation("删除")
    @PostMapping("/delete")
    public Result<?> deleteSurveies(@RequestBody Surveies surveie) {
        boolean flag = surveiesService.removeById(surveie.get_id());
        return Result.ok(flag);
    }

}
