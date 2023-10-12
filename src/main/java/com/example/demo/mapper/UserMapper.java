package com.example.demo.mapper;

import com.example.demo.vo.Page;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserMapper {
    @Select("select * from user")
    List<User> findAll();

    @Transactional
    @Update("update user set name=#{name}，address = #{address},age=#{age},sex=#{sex},phone=#{phone} where id = #{id}")
    void updateById(User user);

    //    @Update("Insert INTO user set name=#{name}，address = #{address},age=#{age},sex=#{sex},phone=#{phone}")
    @Update("Insert INTO user  (name,address,age,sex,phone) values (#{name},#{address},#{age},#{sex},#{phone})")
    void save(User user);

    @Select("select * from user where id = #{id}")
    User findByid(Long id);

    @Select("select * from user limit #{offset},#{pageSize}")
    List<User> findPage(Integer pageNum, Integer pageSize);

    @Select("select count(id) from user")
    Integer countUser();
}

