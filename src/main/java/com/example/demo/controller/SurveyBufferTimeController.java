package com.example.demo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.SurveyBufferTime;
import com.example.demo.service.ISurveyBufferTimeService;
import com.example.demo.vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@Api(value = "SurveyBufferTime接口", tags = {"SurveyBufferTime接口"})
@RequestMapping("/surveyBufferTime")
public class SurveyBufferTimeController {
    @Autowired
    private ISurveyBufferTimeService surveyBufferTimeService;

    @ApiOperation("查询列表")
    @GetMapping("/list")
    public Result<?> findPage(@RequestParam(defaultValue = "1") Integer pageNo,
                              @RequestParam(defaultValue = "10") Integer pageSize) {

        Page<SurveyBufferTime> page = new Page<>(pageNo, pageSize);
        Page<SurveyBufferTime> list = surveyBufferTimeService.page(page);
        return Result.OK(list);

    }

    @ApiOperation("新增")
    @PostMapping("/add")
    public Result<?> addSurveyBufferTime(@RequestBody SurveyBufferTime surveyBufferTime) {
        boolean flag = surveyBufferTimeService.save(surveyBufferTime);
        return Result.OK(flag);
    }

    @ApiOperation("修改")
    @PostMapping("/update")
    public Result<?> updateSurveyBufferTime(@RequestBody SurveyBufferTime surveyBufferTime) {
        boolean flag = surveyBufferTimeService.updateById(surveyBufferTime);
        return Result.OK(flag);
    }

    @ApiOperation("删除")
    @PostMapping("/delete")
    public Result<?> deleteSurveyBufferTime(@RequestBody SurveyBufferTime surveyBufferTime) {
        boolean flag = surveyBufferTimeService.removeById(surveyBufferTime.getIdd());
        return Result.ok(flag);
    }

}
