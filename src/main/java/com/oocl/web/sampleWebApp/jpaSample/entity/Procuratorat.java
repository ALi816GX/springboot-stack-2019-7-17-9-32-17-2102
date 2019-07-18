package com.oocl.web.sampleWebApp.jpaSample.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
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
@Data
@NoArgsConstructor
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

}
