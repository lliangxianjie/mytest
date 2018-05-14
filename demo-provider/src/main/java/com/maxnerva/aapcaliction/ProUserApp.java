package com.maxnerva.aapcaliction;

        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProUserApp
{
    public static void main(String[] args)
    {
        SpringApplication.run(ProUserApp.class, args);
    }
}
