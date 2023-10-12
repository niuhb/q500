package com.example.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("创建Swagger请求参数")
public class User {

    @ApiModelProperty("id")
    private Integer id;
    @ApiModelProperty("name")
    private String name;
    @ApiModelProperty("address")
    private String address;
    private Integer age;
    private String sex;
    private String phone;

}
