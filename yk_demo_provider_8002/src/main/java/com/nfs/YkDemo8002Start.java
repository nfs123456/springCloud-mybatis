package com.nfs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableEurekaClient
@EnableScheduling
@MapperScan(value = "com.nfs.mapper")
public class YkDemo8002Start {
    public static void main(String[] args) {
        SpringApplication.run(YkDemo8002Start.class,args);
    }
}
