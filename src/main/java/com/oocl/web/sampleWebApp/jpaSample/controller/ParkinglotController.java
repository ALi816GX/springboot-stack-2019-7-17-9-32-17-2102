package com.oocl.web.sampleWebApp.jpaSample.controller;

import com.oocl.web.sampleWebApp.jpaSample.dic.Constant;
import com.oocl.web.sampleWebApp.jpaSample.dto.ParkinglotDTO;
import com.oocl.web.sampleWebApp.jpaSample.pojo.Parkinglot;
import com.oocl.web.sampleWebApp.jpaSample.repository.ParkinglotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/parkinglots")
public class ParkinglotController {


    @Autowired
    private ParkinglotRepository parkinglotRepository;


    private final Logger log = Logger.getLogger(this.getClass().getName());


    @PostMapping
    public Parkinglot saveParkinglot(@RequestBody Parkinglot parkinglot) {


        return parkinglotRepository.save(parkinglot);


    }


    @DeleteMapping("/{id}")
    public int deleteParkinglots(@PathVariable int id) {

        parkinglotRepository.deleteById((long) id);

        return Constant.STATE_OK;

    }

















}
