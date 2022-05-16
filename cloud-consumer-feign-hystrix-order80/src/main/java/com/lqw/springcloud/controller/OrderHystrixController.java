package com.lqw.springcloud.controller;

import com.lqw.springcloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
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
@DefaultProperties(defaultFallback = "payment_global_fallback_timeout")
public class OrderHystrixController {

    @Resource
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentOk(@PathVariable("id") String id) {
        return paymentHystrixService.paymentOk(id);
    }

    @HystrixCommand(fallbackMethod = "timeoutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")  //3秒钟以内就是正常的业务逻辑
    })
    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    public String timeout(@PathVariable("id") String id) {
        return paymentHystrixService.timeout(id);
    }

    // 兜底方法
    public String timeoutHandler(@PathVariable("id") String id) {
        return "我是消费者80，对付支付系统繁忙请10秒钟后再试或者自己运行出错请检查自己,(┬＿┬)";
    }

    // 兜底方法
    public String payment_global_fallback_timeout(@PathVariable("id") String id) {
        return "global 222，对方系统繁忙或已经宕机，请10秒后再试,(┬＿┬)";
    }

}
