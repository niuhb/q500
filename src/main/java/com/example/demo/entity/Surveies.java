package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@TableName("mysurveies")
@Data
public class Surveies {

    @TableId(type = IdType.AUTO)
    @ApiModelProperty(value = "主键")
    private Integer _id;

    @TableField("status")
    private Integer status;

    @TableField("id")
    private String id;

    @TableField("date")
    private String date;

    @TableField("`change`")
    private String change;

    @TableField("title")
    private String title;

    @TableField("bufferTime")
    private String bufferTime;

    @TableField("intro")
    private String intro;

}
