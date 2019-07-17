package com.oocl.web.sampleWebApp.jpaSample.entity;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

    public CriminalCase() {
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

    @Override
    public String toString() {
        return "CriminalCase{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", millTime=" + millTime +
                '}';
    }
}
