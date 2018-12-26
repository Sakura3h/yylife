package com.hehe.integration.user;

import com.hehe.integration.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> list() {
        return userRepository.findAll();
    }
}