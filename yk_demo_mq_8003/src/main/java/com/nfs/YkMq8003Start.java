package com.nfs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(value = "com.nfs.mapper")
public class YkMq8003Start {
    public static void main(String[] args) {
        SpringApplication.run(YkMq8003Start.class,args);
    }
}
