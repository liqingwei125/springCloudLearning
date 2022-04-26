package com.lqw.springcloud.dao;

import com.lqw.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author by lqw
 * @Desc TODO
 */
@Mapper
public interface PaymentDao {

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
