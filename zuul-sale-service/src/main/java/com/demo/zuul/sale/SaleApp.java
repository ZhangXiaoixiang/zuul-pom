package com.demo.zuul.sale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class SaleApp {

    public static void main(String[] args) {
        System.out.println("销售模块,属于调用者--");
        SpringApplication.run(SaleApp.class, args);
    }

}

