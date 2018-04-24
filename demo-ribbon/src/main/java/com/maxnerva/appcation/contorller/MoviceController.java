package com.maxnerva.appcation.contorller;

import com.maxnerva.appcation.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class MoviceController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable long id)
    {
        String url = "http://microservice-provider/"+id;
        return this.restTemplate.getForObject(url,User.class);
    }

    @GetMapping("/log-instance")
    public void logUserInstance() {
        ServiceInstance serviceInstance = this.loadBalancerClient.choose("microservice-provider");
        System.out.println("serviceId:" + serviceInstance.getServiceId() + "    host:" + serviceInstance.getHost() +
                "    port:" + serviceInstance.getPort());
    }

}