package com.wunian.jpa.Service.impl;

import com.wunian.jpa.Service.OrderService;
import com.wunian.jpa.dataobject.OrderMaster;
import com.wunian.jpa.respository.OrderMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author fjb
 * @desc
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMasterRepository repository;

    @Override
    public OrderMaster save(OrderMaster orderMaster) {

        return  repository.save(orderMaster);
    }

    @Override
    public OrderMaster findByOrderId(String orderId) {

        return repository.findOrderByOrderId(orderId);
    }
}
