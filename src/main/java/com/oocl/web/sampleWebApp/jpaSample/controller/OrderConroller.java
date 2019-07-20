package com.oocl.web.sampleWebApp.jpaSample.controller;

import com.oocl.web.sampleWebApp.jpaSample.pojo.Order;
import com.oocl.web.sampleWebApp.jpaSample.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.logging.Logger;

/**
 * Created with IDEA
 *
 * @author:linGuangXiong
 * @Date:2019/7/20
 * @Time:16:03
 * @description:
 */



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/orders")
public class OrderConroller {

    @Autowired
    private OrderRepository orderRepository;

    @PostMapping("/{parkingName}/{carNum}")
    public Order saveOrder(@PathVariable String parkingName,@PathVariable String carNum) {

        String orderNum = "" + System.currentTimeMillis();

        Order order = new Order(orderNum,parkingName,carNum,new Date(),null);

        return orderRepository.save(order);

    }

    @PostMapping
    public Order updateOrder(Order order) {


        return orderRepository.save(order);

    }




}
