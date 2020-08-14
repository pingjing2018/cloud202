package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author shkstart
 * @create 2020-08-14 17:12
 */
@Mapper
public interface PaymentDao {
    public int creat(Payment payment);

    public  Payment getPaymentById(@Param("id") Long id);
}
