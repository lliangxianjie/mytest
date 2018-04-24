package com.maxnerva.aaplication.config;

import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;


public class FooConfigration {
    @Bean
    public  BasicAuthRequestInterceptor basicAuthRequestInterceptor()
    {
        return new BasicAuthRequestInterceptor("user" ,"password");
    }
}
