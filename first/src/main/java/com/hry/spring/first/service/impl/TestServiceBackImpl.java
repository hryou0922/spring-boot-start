package com.hry.spring.first.service.impl;

import com.hry.spring.first.service.ITestService;

public class TestServiceBackImpl implements ITestService {

    @Override
    public String queryById(String id) {
        return id + ":" + this.getClass().getSimpleName() ;
    }
}
