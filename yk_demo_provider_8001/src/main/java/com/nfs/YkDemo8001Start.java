package com.nfs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableEurekaClient
@EnableScheduling
@EnableFeignClients(basePackages = "com.nfs.feign_service")
@MapperScan(value = "com.nfs.mapper")
public class YkDemo8001Start {
    public static void main(String[] args) {
        SpringApplication.run(YkDemo8001Start.class,args);
    }
}
