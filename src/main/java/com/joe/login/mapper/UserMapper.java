package com.joe.login.mapper;

import com.joe.login.bean.User;
import org.apache.ibatis.annotations.Mapper;


public interface UserMapper {
    void register(User user);
    User findByUsername(String username);

}
