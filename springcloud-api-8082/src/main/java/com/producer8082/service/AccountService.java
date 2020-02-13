package com.producer8082.service;

import com.producer8082.entity.Account;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public interface AccountService {
    public List<Account> findAll();
    public Account findById(String id);
    public boolean delete(String id);

    @RequestMapping("/producer/list")
    @ResponseBody
    default List<Account> list(){
        return findAll();
    }
}
