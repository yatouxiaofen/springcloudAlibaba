package com.leyou.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = {"com.leyou"})
@MapperScan(basePackages = "com.leyou.user.mapper")
@EnableDiscoveryClient
public class UserApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(UserApplication.class, args);
    }
}
