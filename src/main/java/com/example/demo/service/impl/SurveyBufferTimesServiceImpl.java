package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.SurveyBufferTime;
import com.example.demo.mapper.SurveyBufferTimeMapper;
import com.example.demo.service.ISurveyBufferTimeService;
import org.springframework.stereotype.Service;

@Service
public class SurveyBufferTimesServiceImpl extends ServiceImpl<SurveyBufferTimeMapper, SurveyBufferTime> implements ISurveyBufferTimeService {
}
