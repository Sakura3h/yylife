package com.hehe.yylifeservice.Impl;

import com.hehe.yylifeservice.service.UserService;
import com.hehe.yylifeapi.mapper.UserMapper;
import com.hehe.yylifeapi.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {

 @Resource
 UserMapper userMapper;
    @Override
    public List<User> list() {
        return userMapper.find();
    }
}