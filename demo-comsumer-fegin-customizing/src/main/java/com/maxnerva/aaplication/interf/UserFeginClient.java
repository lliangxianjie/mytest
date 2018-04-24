package com.maxnerva.aaplication.interf;

import com.maxnerva.aaplication.config.FeginConfigration;
import com.maxnerva.aaplication.entity.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "microservice-provider", configuration = FeginConfigration.class)
public interface UserFeginClient {

    @RequestLine("GET /{id}")
    public User findById(@Param("id") long id);

}
