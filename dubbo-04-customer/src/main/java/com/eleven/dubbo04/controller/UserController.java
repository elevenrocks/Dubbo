package com.eleven.dubbo04.controller;


import com.eleven.dubbo04.domain.User;
import com.eleven.dubbo04.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    private UserService service;

    @RequestMapping("/user.do")
    public String UserDetail(Integer id, Model model){
        User user = service.queryUserById(id);
        model.addAttribute("user",user);
        int count = service.queryCount();
        model.addAttribute("count",count);
        return "show";
    }

}
