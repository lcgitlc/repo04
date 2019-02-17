package com.itheima.service.impl;


import com.itheima.domain.User;

import com.itheima.mapper.UserMapper;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private UserMapper accountMapper;


    public User findById(Integer id) {
        return accountMapper.findById(id);
    }

    public void transfer(Integer sid, Integer tid, float money) {
        User saccount=accountMapper.findById(sid);
        User taccount=accountMapper.findById(tid);


        accountMapper.updateAccount(saccount);
        int i=1/0;
        accountMapper.updateAccount(taccount);
    }

    public List<User> findAll() {

        return accountMapper.findAll();
    }
}
