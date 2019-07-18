package com.oocl.web.sampleWebApp.jpaSample.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
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
@Data
@NoArgsConstructor
public class CriminalCase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Length(max = 255)
    @NotNull
    private String name;

    @NotNull
    private Long millTime;


    @OneToOne(cascade = CascadeType.ALL)
    private CriminalDetail criminalDetail;

    @OneToOne(cascade = CascadeType.ALL)
    @NotNull
    private Procuratorat procuratorat;



    public CriminalCase(@Length(max = 255) @NotNull String name, @NotNull Long millTime) {
        this.name = name;
        this.millTime = millTime;
    }

    public CriminalCase(CriminalDetail criminalDetail) {
        this.criminalDetail = criminalDetail;
    }



}
