package com.producer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.producer.dao")
//@EnableEurekaClient
public class SpringbootProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootProducerApplication.class, args);
    }

}
