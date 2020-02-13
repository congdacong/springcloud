package com.customer.controller;

import com.customer.fegin.FeginServer;
import com.producer.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RequestMapping("user_customer")
@RestController
public class AccountCustomerController {
    final String url = "http://springCloud-api/user_producer/producer/";
    @Autowired
    FeginServer feginServer;
//    private RestTemplate restTemplate;
    @RequestMapping("/producer/get/{id}")
    public Account get(@PathVariable("id") String id){
//        String URL = url+"get/";
        return  feginServer.get(id);
    }
    @RequestMapping("/producer/list")
    public List<Account> list(){
//        String URL = url+"list";
        return feginServer.list();
    }

    @RequestMapping("/producer/delete/{id}")
    public boolean delete(@PathVariable("id") String id){
        return feginServer.delete(id);
    }
}