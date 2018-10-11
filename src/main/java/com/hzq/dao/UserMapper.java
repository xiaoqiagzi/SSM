package com.hzq.dao;

import com.hzq.bean.User;
import org.springframework.stereotype.Repository;


@Repository
public interface UserMapper {
    User login(String userName,String password);
}
