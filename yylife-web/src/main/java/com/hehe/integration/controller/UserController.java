package com.hehe.integration.controller;


import com.hehe.yylifeapi.mapper.UserMapper;
import com.hehe.yylifeapi.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {

    @Resource
    UserMapper userMapper;

    @RequestMapping("/Demo")
    public  String index(Model model){
        List<User> listDemo =userMapper.find();
        model.addAttribute("listDemo",listDemo);
        return "index";
    }
}
