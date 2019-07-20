package com.oocl.web.sampleWebApp.jpaSample.repository;

import com.oocl.web.sampleWebApp.jpaSample.pojo.Parkinglot;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

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
public class ParkinglotRepositoryTest {


    @Autowired
    private ParkinglotRepository parkinglotRepository;

    @Test
    public void should_return_parkinglot_when_call_addParkinglot_given_pakinglot(){

        Parkinglot parkinglot = new Parkinglot("leo",10,1);

        Parkinglot result = parkinglotRepository.save(parkinglot);

        Assertions.assertEquals("leo", result.getName());

    }



    @Test
    public void should_return_none_when_call_deleteParkinglotById_given_id(){

        Parkinglot parkinglot = new Parkinglot("leo",10,1);

        Parkinglot result = parkinglotRepository.save(parkinglot);

        parkinglotRepository.deleteById(result.getId());

        Assertions.assertNull(parkinglotRepository.findParkinglotById(result.getId()));

    }


    @Test
    public void should_return_list_when_call_findPakinglotsByPaging_given_none(){


        for (int i = 0; i < 20; i++) {
            parkinglotRepository.save(new Parkinglot("leo"+(20-i),30-i,i));
        }


        Sort sort = new Sort(Sort.Direction.ASC,"id");

        Pageable pageable  = PageRequest.of(0,15,sort);

s

        Assertions.assertEquals(15,result.getContent().size());

    }


    @Test
    public void should_return_parkinglot_when_call_find_pakinglot_by_id_given_id(){

        Parkinglot parkinglot = new Parkinglot("leo",10,1);

        Parkinglot result = parkinglotRepository.save(parkinglot);


        Assertions.assertEquals("leo",result.getName());

    }


    @Test
    public void should_return_parkinglot_when_call_update_paking_lot_given_parking_lot(){

        Parkinglot parkinglot = new Parkinglot("leo",10,1);

        Parkinglot result = parkinglotRepository.save(parkinglot);


        Parkinglot parkinglot2 = new Parkinglot("leo",8,1);
        parkinglot2.setId(result.getId());


        Parkinglot result2 = parkinglotRepository.save(parkinglot2);

        Assertions.assertEquals(8,result2.getCapacity());

    }





}