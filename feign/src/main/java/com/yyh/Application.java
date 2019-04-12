package com.yyh;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author YanYuHang
 * @create 2019-04-11-16:18
 */
@SpringCloudApplication
@EnableFeignClients//开启OpenFeign
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
