package com.customer.fegin;

import com.producer.entity.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "springCloud-api", fallbackFactory = AccountClientServiceFallBackFactory.class)
public interface FeginServer {
    @RequestMapping(value = "/user_producer/producer/get/{id}", method = RequestMethod.GET)
    public Account get(@PathVariable("id") String id);

    @RequestMapping(value = "/user_producer/producer/list", method = RequestMethod.GET)
    public List<Account> list();

    @RequestMapping(value = "/user_producer/producer/delete/{id}", method = RequestMethod.GET)
    public boolean delete(@PathVariable("id") String id);

}
