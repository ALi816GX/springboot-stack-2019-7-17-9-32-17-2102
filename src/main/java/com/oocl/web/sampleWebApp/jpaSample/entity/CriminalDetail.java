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
 * @Time:23:30
 * @description:
 */

@Entity
public class CriminalDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Length(max = 255)
    @NotNull
    private String subjectiveContent;

    @Length(max = 255)
    @NotNull
    private String objectiveContent;

    public CriminalDetail() {

    }

    public CriminalDetail(@Length(max = 255) @NotNull String subjectiveContent, @Length(max = 255) @NotNull String objectiveContent) {
        this.subjectiveContent = subjectiveContent;
        this.objectiveContent = objectiveContent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubjectiveContent() {
        return subjectiveContent;
    }

    public void setSubjectiveContent(String subjectiveContent) {
        this.subjectiveContent = subjectiveContent;
    }

    public String getObjectiveContent() {
        return objectiveContent;
    }

    public void setObjectiveContent(String objectiveContent) {
        this.objectiveContent = objectiveContent;
    }

}
