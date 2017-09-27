package com.hry.spring.first.service;

import com.hry.spring.first.model.TestModel;

import java.util.List;

public interface ITestService {

    int add(TestModel testModel);

    int del(String id);

    TestModel queryById(String id);
}
