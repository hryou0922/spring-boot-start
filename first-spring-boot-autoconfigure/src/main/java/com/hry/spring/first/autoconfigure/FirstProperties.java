package com.hry.spring.first.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = FirstProperties.TEST_PREFIX)
public class FirstProperties {
    public static final String TEST_PREFIX = "my.test";

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
