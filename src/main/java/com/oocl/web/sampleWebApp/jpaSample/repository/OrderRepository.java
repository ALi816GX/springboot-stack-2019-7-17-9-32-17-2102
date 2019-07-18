package com.oocl.web.sampleWebApp.jpaSample.repository;

import com.oocl.web.sampleWebApp.jpaSample.pojo.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created with IDEA
 *
 * @author:linGuangXiong
 * @Date:2019/7/19
 * @Time:01:09
 * @description:
 */
public interface OrderRepository extends JpaRepository<Order,Long> {



}
