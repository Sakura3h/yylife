package com.hehe.yylifeapi.mapper;



import com.hehe.yylifeapi.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface UserMapper {
    @Select("SELECT * FROM user")
    List<User> find();
}
