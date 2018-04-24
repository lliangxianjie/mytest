package com.maxnerva.aaplication.config;

import feign.Contract;
import org.springframework.context.annotation.Bean;

public class FeginConfigration {

    @Bean
    public Contract feignContract()
    {
        return new feign.Contract.Default();
    }
}
