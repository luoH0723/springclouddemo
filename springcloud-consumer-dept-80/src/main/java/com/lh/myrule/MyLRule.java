package com.lh.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyLRule {

    @Bean
    public IRule myRule(){
        return new TestRandomRule();
    }

}
