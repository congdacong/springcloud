package com.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableFeignClients
public class SpringbootCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootCustomerApplication.class, args);
    }
//    @Bean
//    @LoadBalanced
//    /**
//     * 默认论询算法，交替访问。
//     */
//    public RestTemplate getRestTemplate(){
//        return new RestTemplate();
//    }

}
