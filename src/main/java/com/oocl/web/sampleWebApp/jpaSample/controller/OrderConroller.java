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
@RequestMapping("/parkinglots")
public class OrderConroller {

    @Autowired
    private OrderRepository orderRepository;





}
