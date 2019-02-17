package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping("/findAll")
    public String findAll(Model model){
       System.out.println("执行了，，");
       List<User> list= accountService.findAll();
       model.addAttribute("accountList",list);
        return "accountList";
    }
}
