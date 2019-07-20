package com.oocl.web.sampleWebApp.jpaSample.dto;

import com.oocl.web.sampleWebApp.jpaSample.pojo.Parkinglot;
import lombok.Data;

import java.util.List;

/**
 * Created with IDEA
 *
 * @author:linGuangXiong
 * @Date:2019/7/19
 * @Time:08:36
 * @description:
 */
@Data
public class ParkinglotDTO {

    public ParkinglotDTO(List<Parkinglot> data) {
        this.code = 0;
        this.msg = "";
        this.count = data.size();
        this.data = data;
    }

    private int code;
    private String msg;
    private int count;
    private List<Parkinglot> data;

}
