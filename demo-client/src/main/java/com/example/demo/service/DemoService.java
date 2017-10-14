package com.example.demo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="eureka-client")
public interface DemoService {

	@GetMapping("/hello")
	public String hello() throws Exception;
}
