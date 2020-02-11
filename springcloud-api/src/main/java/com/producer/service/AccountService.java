package com.producer.service;

import com.producer.entity.Account;

import java.util.List;

public interface AccountService {
    public List<Account> findAll();
    public Account findById(String id);
    public boolean delete(String id);
}
