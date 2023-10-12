package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@TableName("mysurveybuffertime")
@Data
public class SurveyBufferTime {
    @TableId(type = IdType.AUTO, value = "_id")
    @ApiModelProperty(value = "主键")
    private Integer idd;


    @TableField("id")
    private Integer id;

    @TableField("bufferTime")
    private String bufferTime;



}
