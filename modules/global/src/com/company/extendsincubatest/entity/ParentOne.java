package com.company.extendsincubatest.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "EXTENDSINCUBATEST_PARENT_ONE")
@Entity(name = "extendsincubatest_ParentOne")
public class ParentOne extends StandardEntity {
    private static final long serialVersionUID = -1L;

    @Column(name = "FIRST_ATTR")
    protected String firstAttr;

    public String getFirstAttr() {
        return firstAttr;
    }

    public void setFirstAttr(String firstAttr) {
        this.firstAttr = firstAttr;
    }
}