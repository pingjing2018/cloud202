package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author shkstart
 * @create 2020-08-14 17:14
 */
public interface PaymentService {
    public int creat(Payment payment);
    public  Payment getPaymentById(@Param("id") Long id);
}
