package com.hzq.service;

import com.hzq.bean.User;
import org.springframework.stereotype.Repository;


public interface UserService {
    User login(String userName, String password);
}
