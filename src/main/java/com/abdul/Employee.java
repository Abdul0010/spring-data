package com.abdul;

import lombok.Data;

import javax.persistence.*;

/**
 * @Author by AbdulQader
 * on 8/7/2019.
 */
@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstNamel;
    private String lastName;
    private String role;

    @ManyToOne
    private Manager manager;

    public Employee() {
    }

    public Employee(String firstNamel, String lastName, String role , Manager manager) {
        this.firstNamel = firstNamel;
        this.lastName = lastName;
        this.role = role;
        this.manager=manager;
    }
}
