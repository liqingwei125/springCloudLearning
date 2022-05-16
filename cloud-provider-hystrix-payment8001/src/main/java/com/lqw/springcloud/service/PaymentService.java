package com.lqw.springcloud.service;

/**
 * @author by lqw
 * @Desc TODO
 */
public interface PaymentService {

    String paymentInfoOk(String id);

    String paymentInfoTimeOut(String id);

    String paymentInfoTimeOutHandler(String id);
}
