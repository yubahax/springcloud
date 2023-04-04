package com.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.example.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UMapper {

    @Select("select * from user")
    List<User> getUsers();

}
