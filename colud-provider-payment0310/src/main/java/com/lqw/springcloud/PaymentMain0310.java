package com.lqw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author by lqw
 * @Classname PaymentMain0310
 * @Desc TODO
 * @Date 2022/3/10 17:00
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain0310 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain0310.class, args);
    }

}
