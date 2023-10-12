package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.Surveies;
import com.example.demo.entity.SurveyBufferTime;
import com.example.demo.mapper.SurveiesMapper;
import com.example.demo.mapper.SurveyBufferTimeMapper;
import com.example.demo.service.IResultsService;
import com.example.demo.service.ISurveiesService;
import com.example.demo.service.ISurveyBufferTimeService;
import org.springframework.stereotype.Service;

@Service
public class SurveiesServiceImpl extends ServiceImpl<SurveiesMapper, Surveies> implements ISurveiesService {
}
