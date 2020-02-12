package com.producer8082.service;

import com.producer8082.entity.Account;

import java.util.List;

public interface AccountService {
    public List<Account> findAll();
    public Account findById(String id);
    public boolean delete(String id);
}
