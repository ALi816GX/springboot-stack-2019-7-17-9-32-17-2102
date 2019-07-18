package com.oocl.web.sampleWebApp.jpaSample.repository;

import com.oocl.web.sampleWebApp.jpaSample.pojo.Order;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;


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


    @Autowired
    private OrderRepository orderRepository;

    @Test
    public void should_return_order_when_call_add_order_given_order(){

        Order order = new Order("111","222","333",new Date(),new Date());

        Order result = orderRepository.save(order);

        Assertions.assertEquals("222", result.getParkingName());

    }


    @Test
    public void should_return_order_when_call_update_order_given_order(){

        Order order = new Order("111","222","333",new Date(),new Date());

        Order result = orderRepository.save(order);


        Order order1 = new Order("1110","2220","3330",new Date(),new Date());
        order1.setId(result.getId());


        Order result2 = orderRepository.save(order1);

        Assertions.assertEquals("1110", result.getOrderNum());

    }




}