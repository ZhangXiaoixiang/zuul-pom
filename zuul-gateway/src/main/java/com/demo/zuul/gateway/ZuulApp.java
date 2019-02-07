package com.demo.zuul.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulApp {

    public static void main(String[] args) {

        SpringApplication.run(ZuulApp.class, args);
        System.out.println("开启网关路由: ");
        System.out.println("测试访问地址:  http:localhost:8080/sale/sale-book/612");
        System.out.println("测试访问地址:  http:localhost:8080/test/我是2019");
        System.out.println("端点路由:     http://localhost:8080/actuator/routes");
        System.out.println("端点路由:     http://localhost:8080/actuator/filters");
        System.out.println("zuul整合hystrix,测试容错(版本有点问题):     http://localhost:8080/errorTest");
    }

}

