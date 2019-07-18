package com.oocl.web.sampleWebApp.jpaSample.repository;

import com.oocl.web.sampleWebApp.jpaSample.pojo.Order;
import com.oocl.web.sampleWebApp.jpaSample.pojo.Parkinglot;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created with IDEA
 *
 * @author:linGuangXiong
 * @Date:2019/7/19
 * @Time:01:09
 * @description:
 */


@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class OrderRepositoryTest {


//    @Autowired
//    private OrderRepository orderRepository;
//
//    @Test
//    public void should_return_order_when_call_add_given_pakinglot(){
//
//        Order order = new Order("111","222","333",new Date(),new Date(),);
//
//        Order result = orderRepository.save(order);
//
//        Assertions.assertEquals("222", result.getParkingName());
//
//    }

}