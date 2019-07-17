package com.oocl.web.sampleWebApp.jpaSample.entity;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created with IDEA
 *
 * @author:linGuangXiong
 * @Date:2019/7/18
 * @Time:00:29
 * @description:
 */

@Entity
public class Procuratorat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Length(max = 50)
    @NotNull
    @GeneratedValue
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    List<Inquisitor> list;


    public Procuratorat() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Inquisitor> getList() {
        return list;
    }

    public void setList(List<Inquisitor> list) {
        this.list = list;
    }


}