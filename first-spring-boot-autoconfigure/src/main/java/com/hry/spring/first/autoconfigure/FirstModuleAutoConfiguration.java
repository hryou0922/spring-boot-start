package com.hry.spring.first.autoconfigure;


import com.hry.spring.first.service.ITestService;
import com.hry.spring.first.service.impl.TestServiceBackImpl;
import com.hry.spring.first.service.impl.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(FirstProperties.class)
public class FirstModuleAutoConfiguration {

    @Autowired
    private FirstProperties firstProperties;

    @Bean
    public ITestService createTestService(){
        if(firstProperties.isOpenTestServiceBack()){
            return new TestServiceBackImpl();
        }else{
            return new TestServiceImpl();
        }
    }

}
