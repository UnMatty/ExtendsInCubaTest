package com.company.extendsincubatest.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Extends;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "extendsincubatest_One")
@Extends(ParentOne.class)
public class One extends ParentOne {
    @Column(name = "SECOND_")
    protected String second;

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }
}