package com.eleven.dubbo02.controller;

import com.eleven.dubbo01.domain.User;
import com.eleven.dubbo01.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class myController {
    @Resource
    private UserService userService;

    @RequestMapping("/detail.do")
    public String detail(Model model,Integer id){
        System.out.println("发起请求--->"+userService);

        User user = userService.getUserById(id);
        model.addAttribute("user",user);
        return "show";
    }
}
