package com.example.demo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.User;

@FeignClient(name="eureka-client")
public interface DemoService {

	@GetMapping("/hello")
	public String hello() throws Exception;
	
	@GetMapping("/getUser/{id}")
	public User getUser(@PathVariable("id") Integer userId);
}
