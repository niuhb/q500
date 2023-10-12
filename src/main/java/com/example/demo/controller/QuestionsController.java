package com.example.demo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.Questions;
import com.example.demo.service.IQuestionsService;
import com.example.demo.vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@Api(value = "题目接口", tags = {"题目接口"})
@RequestMapping("/questions")
public class QuestionsController {
    @Autowired
    private IQuestionsService questionsService;


    @ApiOperation("查询列表")
    @GetMapping("/list")
    public Result<?> findPage(@RequestParam(defaultValue = "1") Integer pageNo,
                              @RequestParam(defaultValue = "10") Integer pageSize) {

        Page<Questions> page = new Page<>(pageNo, pageSize);
        Page<Questions> list = questionsService.page(page);
        return Result.OK(list);

    }

    @ApiOperation("新增试题")
    @PostMapping("/add")
    public Result<?> addQuestions(@RequestBody Questions question) {
        boolean flag = questionsService.save(question);
        return Result.OK(flag);
    }

    @ApiOperation("修改试题")
    @PostMapping("/update")
    public Result<?> updateQuestions(@RequestBody Questions question) {
        boolean flag = questionsService.updateById(question);
        return Result.OK(flag);
    }

    @ApiOperation("删除试题")
    @PostMapping("/delete")
    public Result<?> deleteQuestions(@RequestBody Questions question) {
        boolean flag = questionsService.removeById(question.get_id());
        return Result.ok(flag);
    }

}
