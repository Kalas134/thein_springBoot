package com.kdj.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.kdj.demo.model.Member;
import com.kdj.demo.service.MyService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MyController {
	
	@Autowired
	private MyService myService;
	
	@GetMapping("member")
	public List<Member> getMember() {
		// System.out.println();
		
		List<Member> list = myService.selectMember();
		return list;
	}
	
}
