package com.kdj.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.kdj.demo.service.HelloService;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {
	
	private final HelloService helloService;
	private final MessageComponent messageComponent;
	
	public HelloController(HelloService helloService, MessageComponent messageComponent) {
		this.helloService = helloService;
		this.messageComponent = messageComponent;
	}
	
//	Final 키워드를 사용할 수 있다. (필수" 생성자 초기방식)
//	요청 URL : http://localhost:8081/hello
	@GetMapping("/hello")
	public String hello() {
		return (helloService.helloPrint()) + " : " + (messageComponent.getMessage());
	}
	
	
}
