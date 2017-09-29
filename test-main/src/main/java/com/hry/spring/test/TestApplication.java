package com.hry.spring.test;

import com.hry.spring.first.autoconfigure.FirstProperties;
import com.hry.spring.first.service.ITestService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TestApplication {
    public static void main(String[] args){
        ConfigurableApplicationContext cac = SpringApplication.run(TestApplication.class, args);
        FirstProperties firstProperties = cac.getBean(FirstProperties.class);
        System.out.println(firstProperties.getName());

        ITestService testService = cac.getBean(ITestService.class);
        System.out.println(testService.queryById("test"));
    }
}
