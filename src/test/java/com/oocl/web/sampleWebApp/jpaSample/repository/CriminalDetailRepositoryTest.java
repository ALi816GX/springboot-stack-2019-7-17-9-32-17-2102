package com.oocl.web.sampleWebApp.jpaSample.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * Created with IDEA
 *
 * @author:linGuangXiong
 * @Date:2019/7/17
 * @Time:23:36
 * @description:
 */

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class CriminalDetailRepositoryTest {

    @Autowired
    private CriminalDetailsRepository criminalDetailsRepository;

    @Test
    public void should_return_criminalDetail_when_call_findCriminalDetailById_given_id(){


        CriminalDetail criminalDetail = new CriminalDetail("test1","test2");


        CriminalDetail saveResult = criminalDetailsRepository.save(criminalDetail);


        CriminalDetail result = criminalDetailsRepository.findCriminalDetailById(saveResult.getId());

        //then
        Assertions.assertEquals("test2", result.getObjectiveContent());

    }






}