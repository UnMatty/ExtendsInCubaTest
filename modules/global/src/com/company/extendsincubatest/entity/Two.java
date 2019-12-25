package com.company.extendsincubatest.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "extendsincubatest_Two")
public class Two extends ParentTwo {
    @Column(name = "SECOND_")
    protected String second;

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }
}