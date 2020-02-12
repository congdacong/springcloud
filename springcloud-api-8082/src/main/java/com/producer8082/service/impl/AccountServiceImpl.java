package com.producer8082.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.producer8082.dao.AccountDao;
import com.producer8082.entity.Account;
import com.producer8082.service.AccountService;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountDao accountDao;
    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }

    @Override
    public Account findById(String id) {
        return accountDao.findById(id);
    }

    @Override
    public boolean delete(String id) {
       return  accountDao.delete(id);
    }
}
