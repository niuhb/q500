package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.Questions;
import com.example.demo.mapper.QuestionsMapper;
import com.example.demo.service.IQuestionsService;
import org.springframework.stereotype.Service;

@Service
public class QuestionsServiceImpl extends ServiceImpl<QuestionsMapper, Questions> implements IQuestionsService {
}
