package com.hry.spring.test;

import com.hry.spring.first.autoconfigure.FirstProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "test")
// @PropertySource("classpath:application.yml")
public class TestP {
    public static final String TEST_PREFIX = "test";

    private boolean openTestServiceBack; // 如果true,则创建openTestService，否则使用TestServiceBackImpl

    private String name;

    public boolean isOpenTestServiceBack() {
        return openTestServiceBack;
    }

    public void setOpenTestServiceBack(boolean openTestServiceBack) {
        this.openTestServiceBack = openTestServiceBack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
