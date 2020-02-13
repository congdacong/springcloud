package com.producer8082;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.producer8082.dao")
@EnableEurekaClient
public class SpringbootProducer8082Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootProducer8082Application.class, args);
    }

}
