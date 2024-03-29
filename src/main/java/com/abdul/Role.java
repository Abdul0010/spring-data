package com.abdul;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Author by AbdulQader
 * on 12/7/2019.
 */

@Entity
public class Role {
    @Id
    @GeneratedValue
    private Long id;
    String name;

    public Role(String name) {
        this.name = name;
    }

    public Role() {
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
}
