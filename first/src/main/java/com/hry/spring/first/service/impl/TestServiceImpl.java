package com.hry.spring.first.service.impl;

import com.hry.spring.first.model.TestModel;
import com.hry.spring.first.service.ITestService;

import java.util.concurrent.ConcurrentHashMap;

public class TestServiceImpl implements ITestService {
    private ConcurrentHashMap<String, TestModel> hashMap = new ConcurrentHashMap<String, TestModel>();

    @Override
    public int add(TestModel testModel) {
        if(testModel != null && !"".equals(testModel.getId())){
            hashMap.put(testModel.getId(), testModel);
            return 1;
        }else {
            return 0;
        }
    }

    @Override
    public int del(String id) {
        if(!"".equals(id)){
            hashMap.remove(id);
            return 1;
        }
        return 0;
    }

    @Override
    public TestModel queryById(String id) {
        if(!"".equals(id)){
            return hashMap.get(id);
        }
        return null;
    }
}
