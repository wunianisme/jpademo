package com.wunian.jpa.controller;

import com.wunian.jpa.Service.OrderService;
import com.wunian.jpa.dataobject.OrderMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author fjb
 * @desc Spring Data JPA 学习
 */

@RestController
@RequestMapping("/order")
public class OrderController {


    @Autowired
    private OrderService orderService;

    /**
     * 查找数据
     * @param orderId
     * @return
     */
    @GetMapping(value = "/find")
    public OrderMaster findOrder(String orderId){
        OrderMaster orderMaster=orderService.findByOrderId(orderId);

        return orderMaster;
    }

    /**
     * 插入数据
     * @return
     */
    @GetMapping(value = "/save")
    public OrderMaster save(){
        OrderMaster orderMaster=new OrderMaster();
        orderMaster.setOrderId("2");
        orderMaster.setBuyerName("华为");
        orderMaster.setBuyerPhone("15970603844");
        orderMaster.setBuyerAddress("越秀区");
        orderMaster.setBuyerOpenid("abcbcb@aa");
        orderMaster.setOrderAmount(new BigDecimal(1998));
        orderMaster.setOrderStatus(1);
        orderMaster.setPayStatus(1);
        orderMaster.setCreateTime(new Date());
        orderMaster.setUpdateTime(new Date());

        orderMaster= orderService.save(orderMaster);
        return orderMaster;

    }
}
