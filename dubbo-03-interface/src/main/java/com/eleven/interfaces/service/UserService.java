package com.eleven.interfaces.service;

import com.eleven.interfaces.domain.User;

public interface UserService {
    /**
     * 根据id提供信息
     * @param id
     * @return
     */
    User queryUserById(Integer id);

    /**
     * 查询用户数量
     * @return
     */
    int queryUserAll();
}
