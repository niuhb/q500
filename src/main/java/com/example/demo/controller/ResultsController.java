package com.example.demo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.Results;
import com.example.demo.service.IResultsService;
import com.example.demo.vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@Api(value = "Results接口", tags = {"Results接口"})
@RequestMapping("/results")
public class ResultsController {
    @Autowired
    private IResultsService resultsService;

    @ApiOperation("查询列表")
    @GetMapping("/list")
    public Result<?> findPage(@RequestParam(defaultValue = "1") Integer pageNo,
                              @RequestParam(defaultValue = "10") Integer pageSize) {

        Page<Results> page = new Page<>(pageNo, pageSize);
        Page<Results> list = resultsService.page(page);
        return Result.OK(list);

    }

    @ApiOperation("新增")
    @PostMapping("/add")
    public Result<?> addResults(@RequestBody Results result) {
        boolean flag = resultsService.save(result);
        return Result.OK(flag);
    }

    @ApiOperation("修改")
    @PostMapping("/update")
    public Result<?> updateResults(@RequestBody Results result) {
        boolean flag = resultsService.updateById(result);
        return Result.OK(flag);
    }

    @ApiOperation("删除")
    @PostMapping("/delete")
    public Result<?> deleteResults(@RequestBody Results result) {
        boolean flag = resultsService.removeById(result.get_id());
        return Result.ok(flag);
    }

}
