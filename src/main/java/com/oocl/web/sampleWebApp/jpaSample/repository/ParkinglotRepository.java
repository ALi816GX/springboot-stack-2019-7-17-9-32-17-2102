package com.oocl.web.sampleWebApp.jpaSample.repository;


import com.oocl.web.sampleWebApp.jpaSample.pojo.Parkinglot;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created with IDEA
 *
 * @author:linGuangXiong
 * @Date:2019/7/18
 * @Time:23:14
 * @description:
 */
public interface ParkinglotRepository extends JpaRepository<Parkinglot,Long> {


    Parkinglot findParkinglotById(Long id);


    @Override
    Page<Parkinglot> findAll(Pageable pageable);

}
