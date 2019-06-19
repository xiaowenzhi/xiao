package com.bean;

import com.helloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class dog {
    @Bean
    public helloWorld pi(){
        return new helloWorld();
    }
}
