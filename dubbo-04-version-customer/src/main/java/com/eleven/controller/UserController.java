package com.eleven.controller;


import com.eleven.dubbo04.domain.User;
import com.eleven.dubbo04.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService1;
    @Autowired
    private UserService userService2;

    @RequestMapping("/user.do")
    public String UserDetail(Integer id, Model model){
        User user = userService1.queryUserById(id);
        model.addAttribute("user",user);
        int count = userService1.queryCount();
        model.addAttribute("count",count);
        User user1 = userService2.queryUserById(id);
        model.addAttribute("user1",user);
        int count1 = userService2.queryCount();
        model.addAttribute("count1",count);

        return "show";
    }


}
