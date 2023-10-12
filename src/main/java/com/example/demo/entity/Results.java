package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@TableName("myresults")
public class Results {

    @TableId(type = IdType.AUTO)
    @ApiModelProperty(value = "主键")
    private Integer _id;

    @TableField("result_id")
    private Integer result_id;

    @TableField("survey_id")
    private String surveyId;
    @TableField("name")
    private String name;
    @TableField("sex")
    private Integer sex;
    @TableField("sexS")
    private String sexS;
    @TableField("age")
    private Integer age;
    @TableField("date")
    private String date;
    @TableField("other")
    private String other;
    @TableField("total")
    private Integer total;
    @TableField("type")
    private Integer type;
    @TableField("results")
    private String results;


}
