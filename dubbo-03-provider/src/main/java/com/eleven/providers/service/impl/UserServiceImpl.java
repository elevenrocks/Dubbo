package com.eleven.providers.service.impl;

import com.eleven.interfaces.domain.User;
import com.eleven.interfaces.service.UserService;


public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setName("张三");
        user.setAge(24);

        return user;
    }

    @Override
    public int queryUserAll() {
        return 54;
    }
}
