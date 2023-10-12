package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@TableName("mybakedatas")
public class BakeDatas {

    @TableId(type = IdType.AUTO)
    @ApiModelProperty(value = "主键")
    private Integer _id;

    @TableField("survey_id")
    private Integer surveyId;

    @TableField("content")
    private String content;

}
