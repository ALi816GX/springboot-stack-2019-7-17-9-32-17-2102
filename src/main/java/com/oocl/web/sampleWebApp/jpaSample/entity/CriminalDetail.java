package com.oocl.web.sampleWebApp.jpaSample.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
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
@Data
@NoArgsConstructor
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


    public CriminalDetail(@Length(max = 255) @NotNull String subjectiveContent, @Length(max = 255) @NotNull String objectiveContent) {
        this.subjectiveContent = subjectiveContent;
        this.objectiveContent = objectiveContent;
    }

}
