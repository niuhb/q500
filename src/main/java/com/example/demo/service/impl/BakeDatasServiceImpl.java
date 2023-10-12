package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.BakeDatas;
import com.example.demo.mapper.BakeDatasMapper;
import com.example.demo.service.IBakeDatasService;
import org.springframework.stereotype.Service;

@Service
public class BakeDatasServiceImpl extends ServiceImpl<BakeDatasMapper, BakeDatas> implements IBakeDatasService {
}
