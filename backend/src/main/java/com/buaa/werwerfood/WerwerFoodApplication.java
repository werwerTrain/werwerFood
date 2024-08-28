package com.buaa.werwerfood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class WerwerFoodApplication {

    public static void main(String[] args) {
        SpringApplication.run(WerwerFoodApplication.class, args);
    }

}
