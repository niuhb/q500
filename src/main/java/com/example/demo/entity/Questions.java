package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@TableName("myquestions")
public class Questions {

    @TableId(type = IdType.AUTO)
    @ApiModelProperty(value = "主键")
    private Integer _id;
    @TableField("surveyId")
    private String surveyId;
    @TableField("id")
    private Integer id;
    @TableField("text")
    private String text;
    @TableField("type")
    private Integer type;
    @TableField("typeS")
    private String typeS;
    @TableField("required")
    private Integer required;
    @TableField("hasPic")
    private Integer hasPic;
    @TableField("pics")
    private String pics;
    @TableField("optionTexts")
    private String optionTexts;
    @TableField("totalPic")
    private Integer totalPic;
    @TableField("totalOption")
    private Integer totalOption;
    @TableField("optionPics")
    private String optionPics;


}
