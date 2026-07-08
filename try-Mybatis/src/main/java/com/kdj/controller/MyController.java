package com.kdj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.kdj.example.demo.model.Member;
import com.kdj.example.demo.service.MyService;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class MyController {
	
	@Autowired
	private MyService myService;
	
	@GetMapping("member")
	public List<Member> getMember() {
		List<Member> list = myService.selectMember();
		return list;
	}
	
}
