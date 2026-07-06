package com.kdj.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.kdj.demo.service.HelloService;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {
	
	@Autowired
	private final HelloService helloService;
	
	public HelloController(HelloService helloService) {
		this.helloService = helloService;
	}
	
//	Final 키워드르ㅜㄹ 사용할 수 있다. (필수" 생성자 초기방식)
	@GetMapping("/hello")
	public String hello() {
		return helloService.helloPrint();
	}
	
	
}
