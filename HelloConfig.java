package com.spring.boot.custom.knowledge.config;

import com.spring.boot.custom.knowledge.service.Impl.HelloServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Administrator
 */
@Configuration
public class HelloConfig {

    @Bean
    public HelloServiceImpl hello1() {
        return new HelloServiceImpl("A");
    }

    @Bean
    public HelloServiceImpl hello2() {
        return new HelloServiceImpl("B");
    }

}
