package com.example.demo.web;

import javax.annotation.Resource;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.DemoService;
import com.example.demo.model.User;
import com.example.demo.service.TaskService;
import com.example.demo.service.UserService;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Resource
	DiscoveryClient discoveryClient;

	@Resource
	TaskService taskService;

	@Resource
	UserService userService;

	@Resource
	DemoService demoService;
	
	@GetMapping("/hello")
	public String hello() throws Exception {
		String services = "Services: " + discoveryClient.getServices();
		System.out.println(services);
		taskService.doTask();
		return "hello world";

	}

	@GetMapping("/getUser/{id}")
	public User getUser(@PathVariable("id") Integer userId) {
		return userService.getUser(userId);
	}
	
	@GetMapping("/start")
	public String start() throws Exception {
		return demoService.wrap(" start ");

	}

}
