package com.wunian.jpa.respository;

import com.wunian.jpa.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

/**
 * @author fjb
 * @desc Spring Data JPA
 */

public interface OrderMasterRepository extends Repository<OrderMaster,String> {

    //通过解析方法名创建查询

    public OrderMaster save(OrderMaster orderMaster);

    public OrderMaster findByOrderId(String orderId);

    //使用 @Query 创建查询,注意这里查询的不是表而是实体类

    @Query("select a from OrderMaster a where a.orderId=?1")
    public OrderMaster findOrderByOrderId(String orderId);

}
