package com.eleven.dubbo01.service.impl;

import com.eleven.dubbo01.domain.User;
import com.eleven.dubbo01.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User getUserById(Integer id) {
        User u = new User();
        u.setId(id);
        u.setName("eleven_rocks");
        u.setAge(23);
        return u;
    }
}
