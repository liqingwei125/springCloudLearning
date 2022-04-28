package com.lqw.springcloud.controller;

import com.lqw.springcloud.service.PaymentHystrixService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author by lqw
 * @Classname OraderHystrixController
 * @Desc TODO
 * @Date 2022/4/26 17:08
 */
@RestController
public class OrderHystrixController {

    @Resource
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentOk(@PathVariable("id") String id) {
        return paymentHystrixService.paymentOk(id);
    }

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String timeout(@PathVariable("id") String id) {
        return paymentHystrixService.timeout(id);
    }

}
