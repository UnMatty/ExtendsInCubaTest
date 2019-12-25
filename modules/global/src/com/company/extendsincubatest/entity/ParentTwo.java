package com.company.extendsincubatest.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "EXTENDSINCUBATEST_PARENT_TWO")
@Entity(name = "extendsincubatest_ParentTwo")
public class ParentTwo extends StandardEntity {
    private static final long serialVersionUID = 785778049000863501L;

    @Column(name = "FIRST_")
    protected String first;

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }
}