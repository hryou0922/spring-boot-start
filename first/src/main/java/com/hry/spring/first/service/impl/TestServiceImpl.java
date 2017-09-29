package com.hry.spring.first.service.impl;

import com.hry.spring.first.service.ITestService;

import java.util.concurrent.ConcurrentHashMap;

public class TestServiceImpl implements ITestService {
    @Override
    public String queryById(String id) {
        return id + ":" + this.getClass().getSimpleName() ;
    }

}
