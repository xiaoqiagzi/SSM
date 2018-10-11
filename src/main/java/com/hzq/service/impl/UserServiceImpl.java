package com.hzq.service.impl;

import com.hzq.bean.User;
import com.hzq.dao.UserMapper;
import com.hzq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("aaa")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String userName, String password) {
        return userMapper.login(userName,password);
    }

}
