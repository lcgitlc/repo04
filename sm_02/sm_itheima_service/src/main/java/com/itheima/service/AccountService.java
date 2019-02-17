package com.itheima.service;


import com.itheima.domain.User;

import java.util.List;

public interface AccountService {
    //根据id查询账户信息
    User findById(Integer id);
    public void transfer(Integer sid, Integer tid, float money);

    List<User> findAll();
}
