package com.eleven.customers.controller;

import com.eleven.interfaces.domain.User;
import com.eleven.interfaces.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class myController {
    @Resource
    private UserService service;

    @RequestMapping("/user")
    public String userDetail(Integer id,Model model){
        User u = service.queryUserById(id);
        int count = service.queryUserAll();
        model.addAttribute("user",u);
        model.addAttribute("count",count);
        return "show";
    }
}
