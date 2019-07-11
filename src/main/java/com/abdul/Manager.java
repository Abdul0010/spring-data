package com.abdul;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * @Author by AbdulQader
 * on 8/7/2019.
 */
@Data
@Entity
public class Manager {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "manager")
    List<Employee> employees;
    private Manager(){

    }

    public Manager(String name) {
        this.name = name;
    }
}
