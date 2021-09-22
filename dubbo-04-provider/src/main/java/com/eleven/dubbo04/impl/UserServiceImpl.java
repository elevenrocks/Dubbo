package com.eleven.dubbo04.impl;

import com.eleven.dubbo04.domain.User;
import com.eleven.dubbo04.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setName("张三");
        user.setAge(43);
        return user;
    }

    @Override
    public int queryCount() {
        return 34;
    }
}
