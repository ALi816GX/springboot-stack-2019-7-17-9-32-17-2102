package com.oocl.web.sampleWebApp.jpaSample.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;

/**
 * Created with IDEA
 *
 * @author:linGuangXiong
 * @Date:2019/7/18
 * @Time:22:06
 * @description:
 */

@Entity
@Data
@NoArgsConstructor
public class Parkinglot {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @Column(name="name", unique=true)
    private String name;

    @Length
    private int capacity;


    private int index;


}