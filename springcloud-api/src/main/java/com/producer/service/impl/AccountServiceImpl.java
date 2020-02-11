package com.producer.service.impl;

import com.producer.dao.AccountDao;
import com.producer.entity.Account;
import com.producer.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
