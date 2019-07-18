package com.oocl.web.sampleWebApp.jpaSample.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


/**
 * Created with IDEA
 *
 * @author:linGuangXiong
 * @Date:2019/7/17
 * @Time:21:35
 * @description:
 */

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class CriminalCaseRepositoryTest {

    @Autowired
    private CriminalCaseRepository criminalCaseRepository;


    @Test
    public void should_return_singleEntity_when_call_findCriminalCaseById_given_id(){

        //given
        CriminalCase criminalCase = new CriminalCase();
        criminalCase.setName("test");
        criminalCase.setMillTime(System.currentTimeMillis());
        CriminalCase criminalCaseSave = criminalCaseRepository.save(criminalCase);

        //when
        CriminalCase result  = criminalCaseRepository.findCriminalCaseById(criminalCaseSave.getId());


        //then
        Assertions.assertEquals("test", result.getName());

    }


    @Test
    public void should_return_CriminalCases_when_findAllBySort(){

        //given
        for (int i = 0; i < 5; i++) {
            CriminalCase criminalCase = new CriminalCase();
            criminalCase.setName("test"+(5-i));
            criminalCase.setMillTime(System.currentTimeMillis());
            criminalCaseRepository.save(criminalCase);
        }

        Sort sort = new Sort(Sort.Direction.ASC, "millTime");

        //Sort
        List<CriminalCase> list = criminalCaseRepository.findAll(sort);
        for (CriminalCase x:list) {
            System.out.println("+++"+x.toString());
        }

        Assertions.assertEquals(5, list.size());
        Assertions.assertEquals("test1", list.get(4).getName());


    }


    @Test
    public void should_return_CriminalCases_when_call_findCriminalCasesByName_given_name(){

        criminalCaseRepository.save(new CriminalCase("Leo",System.currentTimeMillis()));
        criminalCaseRepository.save(new CriminalCase("Leo1",System.currentTimeMillis()));
        criminalCaseRepository.save(new CriminalCase("Leo",System.currentTimeMillis()));
        criminalCaseRepository.save(new CriminalCase("Leo1",System.currentTimeMillis()));

        List<CriminalCase> list = criminalCaseRepository.findCriminalCasesByName("Leo");

        Assertions.assertEquals(2, list.size());


    }



    @Test
    public void should_return_none_when_call_deleteById_given_id(){

        criminalCaseRepository.save(new CriminalCase("Leo",System.currentTimeMillis()));
        criminalCaseRepository.save(new CriminalCase("Leo1",System.currentTimeMillis()));

        CriminalCase criminalCase = criminalCaseRepository.save(new CriminalCase("Leo",System.currentTimeMillis()));

        criminalCaseRepository.save(new CriminalCase("Leo1",System.currentTimeMillis()));

        criminalCaseRepository.deleteById(criminalCase.getId());

        Assertions.assertNull(criminalCaseRepository.findCriminalCaseById(criminalCase.getId()));


    }


    @Test
    public void should_return_none_when_call_save_CriminalCase_with_Criminal_Detail(){

        CriminalCase a = criminalCaseRepository.save(new CriminalCase("Leo",System.currentTimeMillis()));
        criminalCaseRepository.save(new CriminalCase("Leo1",System.currentTimeMillis()));

        CriminalDetail criminalDetail = new CriminalDetail("Messi1","Messi2");
        CriminalCase saveCri = new CriminalCase(criminalDetail);
        saveCri.setId(a.getId());

        CriminalCase result = criminalCaseRepository.save(saveCri);


        Assertions.assertEquals("Messi2",result.getCriminalDetail().getObjectiveContent());


    }

    @Test
    public void should_return_entity_when_call_save_CriminalCase_with_procuratorat(){

        CriminalCase a = criminalCaseRepository.save(new CriminalCase("Leo",System.currentTimeMillis()));
        criminalCaseRepository.save(new CriminalCase("Leo1",System.currentTimeMillis()));

        Procuratorat procuratorat = new Procuratorat();
        procuratorat.setName("kkkk");
        CriminalCase saveCri = new CriminalCase();
        saveCri.setId(a.getId());
        saveCri.setProcuratorat(procuratorat);

        CriminalCase result = criminalCaseRepository.save(saveCri);

        Assertions.assertEquals("kkkk",result.getProcuratorat().getName());

    }







}