package com.oocl.web.sampleWebApp.jpaSample.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * Created with IDEA
 *
 * @author:linGuangXiong
 * @Date:2019/7/19
 * @Time:00:50
 * @description:
 */

@Entity
@Data
@NoArgsConstructor
@Table(name = "order_table")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String orderNum;

    private String parkingName;

    private String carNum;

    //@DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date endDate;

    private int state = 1;


    public Order(String orderNum, String parkingName, String carNum, Date createDate, Date endDate) {
        this.orderNum = orderNum;
        this.parkingName = parkingName;
        this.carNum = carNum;
        this.createDate = createDate;
        this.endDate = endDate;
        this.state = state;
    }


}
