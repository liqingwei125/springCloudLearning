package com.lqw.springcloud.service;

import com.lqw.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author by lqw
 * @Desc TODO
 */
public interface PaymentService {
    /**
     * 添加
     * @param payment 实体
     * @return 1
     */
    public int create(Payment payment);

    /**
     * 根据Id查询详情
     * @param id 入参
     * @return 详情
     */
    public Payment getPaymentById(@Param("id") Long id);
}
