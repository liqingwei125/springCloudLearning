package com.lqw.springcloud.service.impl;

import com.lqw.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author by lqw
 * @Classname PaymentServiceImpl
 * @Desc TODO
 * @Date 2022/4/26 15:43
 */
@Service
public class PaymentServiceImpl implements PaymentService {


    @Override
    public String paymentInfoOk(String id) {
        return "线程池：" + Thread.currentThread().getName() + " paymentInfo_ok,id: "+ id +"\t"+ "O(∩_∩)O";
    }

    @Override
    public String paymentInfoTimeOut(String id) {
        Integer timeNumber = 3;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池： "+ Thread.currentThread().getName() + " paymentInfo_ok,id: "+ id +"\t"+ "O(∩_∩)O"+ " 耗时(秒): "+ timeNumber;
    }
}
