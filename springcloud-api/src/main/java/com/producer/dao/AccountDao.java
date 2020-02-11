package com.producer.dao;


import com.producer.entity.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDao {
    public List<Account> findAll();
    public Account findById(String id);
    public boolean delete(String id);
}
