package com.hzq.controller;

import com.hzq.bean.User;
import com.hzq.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("/login")
    public ModelAndView  doLogin(User user, HttpSession session){
        User login=userService.login(user.getUserName(),user.getPassword());
        session.setAttribute("user",user);
        System.out.println("4454");
        return new ModelAndView("/success.jsp");
    }

}
