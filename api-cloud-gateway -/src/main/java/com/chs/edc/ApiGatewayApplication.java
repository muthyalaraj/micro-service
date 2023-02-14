package com.chs.edc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.HystrixCircuitBreakerAutoConfiguration;
import org.springframework.web.reactive.DispatcherHandler;

@EnableEurekaClient
@SpringBootApplication
@EnableHystrix
@ConditionalOnClass({ DispatcherHandler.class,
    HystrixCircuitBreakerAutoConfiguration.class })
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

}
