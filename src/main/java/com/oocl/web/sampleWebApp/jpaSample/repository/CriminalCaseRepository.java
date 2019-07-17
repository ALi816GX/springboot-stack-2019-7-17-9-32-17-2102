package com.oocl.web.sampleWebApp.jpaSample.repository;

import com.oocl.web.sampleWebApp.jpaSample.entity.CriminalCase;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created with IDEA
 *
 * @author:linGuangXiong
 * @Date:2019/7/17
 * @Time:21:35
 * @description:
 */
public interface CriminalCaseRepository extends JpaRepository<CriminalCase,Long> {


    CriminalCase findCriminalCaseById(Long id);

    @Override
    List<CriminalCase> findAll(Sort sort);
}
