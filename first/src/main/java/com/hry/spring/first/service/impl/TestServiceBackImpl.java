package com.hry.spring.first.service.impl;

import com.hry.spring.first.model.TestModel;
import com.hry.spring.first.service.ITestService;

public class TestServiceBackImpl implements ITestService {

    @Override
    public int add(TestModel testModel) {
        System.out.print(this.getClass() + ": add ");
        return -1;
    }

    @Override
    public int del(String id) {
        System.out.print(this.getClass() + ": del ");
        return -1;
    }

    @Override
    public TestModel queryById(String id) {
        System.out.print(this.getClass() + ": queryById ");
        TestModel t = new TestModel();
        t.setName(this.getClass().getName() + "back");
        return t;
    }
}
