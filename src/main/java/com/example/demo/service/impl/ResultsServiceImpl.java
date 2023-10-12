package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.Results;
import com.example.demo.mapper.ResultsMapper;
import com.example.demo.service.IResultsService;
import org.springframework.stereotype.Service;

@Service
public class ResultsServiceImpl extends ServiceImpl<ResultsMapper, Results> implements IResultsService {
}
