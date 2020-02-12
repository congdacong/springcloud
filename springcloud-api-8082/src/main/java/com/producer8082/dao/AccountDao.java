package com.producer8082.dao;


import org.springframework.stereotype.Repository;
import com.producer8082.entity.Account;

import java.util.List;

@Repository
public interface AccountDao {
    public List<Account> findAll();
    public Account findById(String id);
    public boolean delete(String id);
}
