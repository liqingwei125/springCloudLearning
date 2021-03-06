package com.lqw.springcloud.controller;

import com.lqw.springcloud.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author by lqw
 * @Classname PaymentHystrixController
 * @Desc TODO
 * @Date 2022/4/26 15:52
 */
@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentHystrixController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String port;

    @GetMapping("/hystrix/ok/{id}")
    public String paymentOk(@PathVariable("id") String id) {

        String result = paymentService.paymentInfoOk(id);
        log.info("*********result: "+ result);

        return result;
    }
    @HystrixCommand(fallbackMethod = "timeoutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
    })
    @GetMapping("/hystrix/timeout/{id}")
    public String timeout(@PathVariable("id") String id) {

        String result = paymentService.paymentInfoTimeOut(id);
        log.info("*********result: "+ result);

        return result;
    }

    public String timeoutHandler(@PathVariable("id") String id) {

        String result = paymentService.paymentInfoTimeOutHandler(id);
        log.info("*********result: "+ result);

        return result;
    }

}
