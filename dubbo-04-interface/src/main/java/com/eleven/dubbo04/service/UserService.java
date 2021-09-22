package com.eleven.dubbo04.service;

import com.eleven.dubbo04.domain.User;

public interface UserService {
    User queryUserById(Integer id);
    int queryCount();
}
