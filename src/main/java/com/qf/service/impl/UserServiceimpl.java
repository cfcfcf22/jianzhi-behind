package com.qf.service.impl;

import com.qf.dao.UserDao;
import com.qf.pojo.User;
import com.qf.repository.UserRepository;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceimpl implements UserService {
    @Autowired
    public UserRepository userRepository;
    @Autowired
    public UserDao userDao;
    @Resource
    private UserDao userDaor;
    //注册 新增用户
    @Override
    public User insert(User user) {
        return userRepository.save(user);
    }
    //登录 验证信息
   @Override
    public User login(int phone, String pass) {
        User lu = userDaor.findByName(pass);
        if (lu!=null){
            if (lu.getPass().equals(pass)){
                return lu;
            }
        }
        return null;
    }

    @Override
    public User userupdate(User user) {
       return userRepository.saveAndFlush(user);
    }

    @Override
    public int findBypic(float photo) {
        return 0;
    }


}
