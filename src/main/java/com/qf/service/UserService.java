package com.qf.service;

import com.qf.pojo.User;

import java.util.List;

public interface UserService {
    //注册新增用户
    public User insert(User user);
    //登录验证
    public User login(int phone,String pass);
    //个人信息修改
    public User userupdate(User user);
    //手机号调头像
    public int findBypic(float photo);
}
