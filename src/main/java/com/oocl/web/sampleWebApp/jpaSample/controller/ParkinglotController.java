package com.oocl.web.sampleWebApp.jpaSample.controller;

import com.oocl.web.sampleWebApp.jpaSample.pojo.Parkinglot;
import com.oocl.web.sampleWebApp.jpaSample.repository.ParkinglotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

/**
 * Created with IDEA
 *
 * @author:linGuangXiong
 * @Date:2019/7/19
 * @Time:01:27
 * @description:
 */

@RestController
@RequestMapping("/parkinglots")
public class ParkinglotController {


    @Autowired
    private ParkinglotRepository parkinglotRepository;


    private final Logger log = Logger.getLogger(this.getClass().getName());

    @PostMapping
    public Parkinglot saveParkinglot(@RequestBody Parkinglot parkinglot) {

        log.info("add parkinglot"+parkinglot.toString());

        return parkinglotRepository.save(parkinglot);

    }


    @GetMapping
    public List<Parkinglot> getParkinglots() {

        log.info("get parkinglots");

        return parkinglotRepository.findAll();

    }










}
