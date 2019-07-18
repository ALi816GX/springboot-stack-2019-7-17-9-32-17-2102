package com.oocl.web.sampleWebApp.jpaSample.repository;


import com.oocl.web.sampleWebApp.jpaSample.pojo.Parkinglot;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created with IDEA
 *
 * @author:linGuangXiong
 * @Date:2019/7/18
 * @Time:23:14
 * @description:
 */
public interface PakinglotRepository extends JpaRepository<Parkinglot,Long> {


    Parkinglot findParkinglotById(Long id);

}
