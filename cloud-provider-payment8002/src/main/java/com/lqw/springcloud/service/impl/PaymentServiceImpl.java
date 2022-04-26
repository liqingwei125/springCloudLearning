package com.lqw.springcloud.service.impl;

import com.lqw.springcloud.dao.PaymentDao;
import com.lqw.springcloud.entities.Payment;
import com.lqw.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author by lqw
 * @Classname PaymentService
 * @Desc TODO
 * @Date 2022/3/10 20:26
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;


    @Override
    public int create(Payment payment) {

        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
