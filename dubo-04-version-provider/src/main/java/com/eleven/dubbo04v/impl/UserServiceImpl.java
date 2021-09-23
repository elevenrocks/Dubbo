package com.eleven.dubbo04v.impl;

import com.eleven.dubbo04.domain.User;
import com.eleven.dubbo04.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id) {
        User u = new User();
        u.setId(id);
        u.setName("TopRocks");
        u.setAge(34);
        return u;
    }

    @Override
    public int queryCount() {
        return 58;
    }
}
