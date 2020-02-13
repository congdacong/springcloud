package com.customer.fegin;

import com.producer.entity.Account;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class AccountClientServiceFallBackFactory implements FallbackFactory<FeginServer> {
    @Override
    public FeginServer create(Throwable throwable) {
        return new FeginServer() {
            @Override
            public Account get(String id) {
                Account account = new Account();
                account.setId(id);
                account.setName("该id不存在");
                return  account;
            }

            @Override
            public List<Account> list() {
                return null;
            }

            @Override
            public boolean delete(String id) {
                return false;
            }
        };
    }
}
