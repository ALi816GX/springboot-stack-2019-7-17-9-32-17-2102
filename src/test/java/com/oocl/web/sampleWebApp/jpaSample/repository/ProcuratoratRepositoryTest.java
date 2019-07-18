package com.oocl.web.sampleWebApp.jpaSample.repository;

import com.oocl.web.sampleWebApp.jpaSample.entity.CriminalCase;
import com.oocl.web.sampleWebApp.jpaSample.entity.CriminalDetail;
import com.oocl.web.sampleWebApp.jpaSample.entity.Inquisitor;
import com.oocl.web.sampleWebApp.jpaSample.entity.Procuratorat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created with IDEA
 *
 * @author:linGuangXiong
 * @Date:2019/7/18
 * @Time:00:37
 * @description:
 */

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ProcuratoratRepositoryTest {

    @Autowired
    private ProcuratoratRepository procuratoratRepository;


    @Test
    public void should_return_inquisitorList_when_call_findinquisitorListByProcuratoratId_given_id(){

        List<Inquisitor> inquisitorList = new ArrayList<>();
        inquisitorList.add(new Inquisitor("abc"));
        inquisitorList.add(new Inquisitor("bcd"));

        Procuratorat procuratorat = new Procuratorat();
        procuratorat.setList(inquisitorList);
        procuratorat.setName("kkk");


        Procuratorat result = procuratoratRepository.save(procuratorat);

        Procuratorat procuratorat1 = procuratoratRepository.findProcuratoratById(result.getId());

        Assertions.assertEquals(2,procuratorat1.getList().size());



    }



}