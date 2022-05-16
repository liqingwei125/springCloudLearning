package com.lqw.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author by lqw
 * @Classname PaymentHystrixServiceImpl
 * @Desc TODO
 * @Date 2022/4/29 9:34
 */
@Component
public class PaymentHystrixServiceImpl implements PaymentHystrixService{
    @Override
    public String paymentOk(String id) {
        return "系统异常：调用PaymentHystrixService_paymentOk方法/(ㄒoㄒ)/~~";
    }

    @Override
    public String timeout(String id) {
        return "系统异常：调用PaymentHystrixService_timeout方法/(ㄒoㄒ)/~~";
    }
}
