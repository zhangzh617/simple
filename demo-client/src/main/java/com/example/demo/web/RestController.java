package com.example.demo.web;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.User;
import com.example.demo.service.DemoService;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Resource
	DemoService demoService;

	@GetMapping("/call")
	public String call() throws Exception {

		//return "call result:" + demoService.hello();
		User user = demoService.getUser(1);
		return "user name:" + user.getUserName()+",pwd:"+user.getPassword();

	}

}
