package com.maxnerva.aaplication.interf;

import com.maxnerva.aaplication.entity.User;
import com.maxnerva.aaplication.impl.FeignClientFallBack;
import org.springframework.cloud.netflix.feign.FeignClient;;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "microservice-provider", fallback = FeignClientFallBack.class)
public interface UserFeginClient {

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User findById(@PathVariable("id") long id);

}
