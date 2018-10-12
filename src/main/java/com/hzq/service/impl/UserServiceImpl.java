package com.hzq.service.impl;

import com.hzq.bean.User;
import com.hzq.dao.UserMapper;
import com.hzq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User login(String userName, String password) {
        return userMapper.login(userName,password);
    }

}
