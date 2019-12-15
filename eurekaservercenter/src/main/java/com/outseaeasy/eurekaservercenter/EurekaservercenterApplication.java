package com.outseaeasy.eurekaservercenter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
@Slf4j
public class EurekaservercenterApplication {

    public static void main(String[] args) {
        log.info("eureka server start!");
        SpringApplication.run(EurekaservercenterApplication.class, args);
    }

}
