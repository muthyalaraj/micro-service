package com.chs.edc;

import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableHystrix
public class FallBackMethodController {
	
	
	@GetMapping("/userServiceFallBack")
	public String userServiceFallBackMethod() {	
		return "User Service is Taking Longer than Expected. Please Try Again Later";
		
	}
	
	@GetMapping("/departmentServiceFallBack")
	public String departmentServiceFallBackMethod() {	
		return "Department Service is Taking Longer than Expected. Please Try Again Later";
		
	}

}
