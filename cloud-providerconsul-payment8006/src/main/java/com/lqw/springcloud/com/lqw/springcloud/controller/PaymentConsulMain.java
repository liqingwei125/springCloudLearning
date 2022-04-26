package com.lqw.springcloud.com.lqw.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author by lqw
 * @Classname PaymentConsulMain
 * @Desc TODO
 * @Date 2022/4/11 10:38
 */
@RestController
@Slf4j
public class PaymentConsulMain {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/consul")
    public String paymentzk(){
        return "springcloud with consul:"+serverPort+"\t"+ UUID.randomUUID().toString();
    }

}
