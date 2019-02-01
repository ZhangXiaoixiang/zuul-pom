package com.dmeo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceApp {

    public static void main(String[] args) {
        System.out.println("启动提供者   port: 9000 zuul-book-service");
        SpringApplication.run(ServiceApp.class, args);
    }

}


