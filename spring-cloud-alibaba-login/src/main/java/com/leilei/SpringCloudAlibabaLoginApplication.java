package com.leilei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringCloudAlibabaLoginApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAlibabaLoginApplication.class, args);
    }

}
