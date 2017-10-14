package com.example.demo.web;

import javax.annotation.Resource;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.TaskService;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Resource
	DiscoveryClient discoveryClient;

	@Resource
	TaskService taskService;

	@GetMapping("/hello")
	public String hello() throws Exception {
		String services = "Services: " + discoveryClient.getServices();
		System.out.println(services);
		taskService.doTask();
		return "hello world";

	}

}
