package com.producer.controller;

import com.producer.entity.Account;
import com.producer.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user_producer")
public class AccountProducerController {
    @Autowired
    AccountService accountService;
    @RequestMapping("/producer/get/{id}")
    public Account get(@PathVariable("id") String id){
        return accountService.findById(id);
    }

    @RequestMapping("/producer/list")
    @ResponseBody
    public List<Account> list(){
        return accountService.findAll();
    }

    @RequestMapping("/producer/delete/{id}")
    public boolean delete(@PathVariable("id") String id){
         return accountService.delete(id);
    }
}
