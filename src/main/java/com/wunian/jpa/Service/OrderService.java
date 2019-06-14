package com.wunian.jpa.Service;

import com.wunian.jpa.dataobject.OrderMaster;

/**
 * @author fjb
 * @desc
 */
public interface OrderService {

    public OrderMaster save(OrderMaster orderMaster);

    public OrderMaster findByOrderId(String orderId);
}
