package com.oocl.web.sampleWebApp.jpaSample.entity;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created with IDEA
 *
 * @author:linGuangXiong
 * @Date:2019/7/17
 * @Time:21:34
 * @description:
 */

@Entity
public class CriminalCase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Length(max = 255)
    @NotNull
    private String name;

    @NotNull
    private Long millTime;


    @OneToOne
    private CriminalDetail criminalDetail;


    public CriminalCase() {
    }

    public CriminalCase(@Length(max = 255) @NotNull String name, @NotNull Long millTime) {
        this.name = name;
        this.millTime = millTime;
    }

    public CriminalCase(CriminalDetail criminalDetail) {
        this.criminalDetail = criminalDetail;
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

    public Long getMillTime() {
        return millTime;
    }

    public void setMillTime(Long millTime) {
        this.millTime = millTime;
    }

    public CriminalDetail getCriminalDetail() {
        return criminalDetail;
    }

    public void setCriminalDetail(CriminalDetail criminalDetail) {
        this.criminalDetail = criminalDetail;
    }

    @Override
    public String toString() {
        return "CriminalCase{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", millTime=" + millTime +
                ", criminalDetail=" + criminalDetail +
                '}';
    }
}
