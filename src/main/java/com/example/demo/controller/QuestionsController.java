package com.example.demo.controller;


import com.example.demo.mapper.Questions;
import com.example.demo.service.IQuestionsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "题目接口", tags = {"题目接口"})
@RequestMapping("/questions")
public class QuestionsController {
    @Autowired
    private IQuestionsService questionsService;


    @ApiOperation("新增试题")
    @PostMapping("/add")
    public boolean addQuestions(@RequestBody Questions question){
        boolean flag = questionsService.save(question);
        return flag;
    }
}
