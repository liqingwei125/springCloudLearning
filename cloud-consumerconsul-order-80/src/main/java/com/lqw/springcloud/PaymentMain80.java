package com.lqw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author by lqw
 * @Classname ParymentMain80
 * @Desc TODO
 * @Date 2022/4/11 11:25
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain80 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain80.class, args);
    }

}
