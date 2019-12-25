package com.company.extendsincubatest.core;

import com.company.extendsincubatest.ExtendsincubatestTestContainer;
import com.company.extendsincubatest.entity.One;
import com.company.extendsincubatest.entity.ParentOne;
import com.company.extendsincubatest.entity.ParentTwo;
import com.company.extendsincubatest.entity.Two;
import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Transaction;
import com.haulmont.cuba.core.TypedQuery;
import com.haulmont.cuba.core.global.AppBeans;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.security.entity.User;
import org.junit.After;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SampleIntegrationTest {

    @ClassRule
    public static ExtendsincubatestTestContainer cont = ExtendsincubatestTestContainer.Common.INSTANCE;

    private Metadata metadata;
    private Persistence persistence;
    private DataManager dataManager;

    @Before
    public void setUp() throws Exception {
        metadata = cont.metadata();
        persistence = cont.persistence();
        dataManager = AppBeans.get(DataManager.class);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void createParentOne() {
        ParentOne parentOne = metadata.create(ParentOne.class);
        parentOne.setFirstAttr("test");
    }

    @Test
    public void createOne() {
        One one = metadata.create(One.class);
        one.setFirstAttr("test");
    }

    @Test
    public void extendTestForOne() {
        ParentOne parentOne = metadata.create(ParentOne.class);
        One one = (One) parentOne;
    }

    @Test
    public void extendTestForOneReverse() {
        One one = metadata.create(One.class);
        ParentOne parentOne = (ParentOne) one;
    }

    @Test
    public void createParentTwo() {
        ParentTwo parentTwo = metadata.create(ParentTwo.class);
        parentTwo.setFirst("test");
    }

    @Test
    public void createTwo() {
        Two two = metadata.create(Two.class);
        two.setFirst("test");
    }

    @Test
    public void extendTestForTwo() {
        ParentTwo parentTwo = metadata.create(ParentTwo.class);
        Two two = (Two) parentTwo;
    }

    @Test
    public void extendTestForTwoReverse() {
        Two two = metadata.create(Two.class);
        ParentTwo parentTwo = (ParentTwo) two;
    }
}