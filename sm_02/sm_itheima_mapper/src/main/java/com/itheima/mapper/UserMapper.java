package com.itheima.mapper;


import com.itheima.domain.User;

import java.util.List;

public interface UserMapper {
    //根据id查询账户信息
    User findById(Integer id);
    //更新账户信息
    void updateAccount(User account);

    List<User> findAll();
}
