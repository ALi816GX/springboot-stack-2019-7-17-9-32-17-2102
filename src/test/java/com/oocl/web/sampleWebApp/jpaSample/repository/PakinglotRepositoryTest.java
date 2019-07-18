package com.oocl.web.sampleWebApp.jpaSample.repository;

import com.oocl.web.sampleWebApp.jpaSample.pojo.Parkinglot;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created with IDEA
 *
 * @author:linGuangXiong
 * @Date:2019/7/18
 * @Time:23:18
 * @description:
 */

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class PakinglotRepositoryTest {


    @Autowired
    private PakinglotRepository pakinglotRepository;

    @Test
    public void should_return_parkinglot_when_call_addParkinglot_given_pakinglot(){

        Parkinglot parkinglot = new Parkinglot("leo",10,1);

        Parkinglot result = pakinglotRepository.save(parkinglot);

        Assertions.assertEquals("leo", result.getName());

    }



    @Test
    public void should_return_none_when_call_deleteParkinglotById_given_id(){

        Parkinglot parkinglot = new Parkinglot("leo",10,1);

        Parkinglot result = pakinglotRepository.save(parkinglot);

        pakinglotRepository.deleteById(result.getId());

        Assertions.assertNull(pakinglotRepository.findParkinglotById(result.getId()));

    }





}