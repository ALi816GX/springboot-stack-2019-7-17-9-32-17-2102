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
 * @Date:2019/7/18
 * @Time:01:06
 * @description:
 */

@Entity
@Data
@NoArgsConstructor
public class Inquisitor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Length(max = 255)
    @NotNull
    private String name;

    public Inquisitor(@Length(max = 255) @NotNull String name) {
        this.name = name;
    }

}
