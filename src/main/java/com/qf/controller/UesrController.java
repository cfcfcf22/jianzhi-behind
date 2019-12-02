package com.qf.controller;

import com.qf.cogfig.R;
import com.qf.pojo.User;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class UesrController {
    @Autowired
    public UserService userService;
    //注册  用户新增
    @RequestMapping("/ins")
    public User insert(@RequestBody User user){
        return userService.insert(user);
    }
  /*  //登录验证
    public R login(@RequestBody Integer phone, @RequestBody String pass, HttpSession session){
        User login = userService.login(phone,pass);
        if (login!=null){
            //success
            session.setAttribute("user",login);
            return R.ok();
        }
        return R.error();
    }*/
  //个人信息修改
    @RequestMapping("/uupdate")
    public User userup(@RequestBody User user){
        return userService.userupdate(user);
    }
}
