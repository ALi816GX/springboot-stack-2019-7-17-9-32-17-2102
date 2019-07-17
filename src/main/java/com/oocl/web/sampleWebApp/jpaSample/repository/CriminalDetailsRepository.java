package com.oocl.web.sampleWebApp.jpaSample.repository;

import com.oocl.web.sampleWebApp.jpaSample.entity.CriminalDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created with IDEA
 *
 * @author:linGuangXiong
 * @Date:2019/7/17
 * @Time:23:36
 * @description:
 */
public interface CriminalDetailsRepository extends JpaRepository<CriminalDetail,Long> {


    CriminalDetail findCriminalDetailById(Long id);


}
