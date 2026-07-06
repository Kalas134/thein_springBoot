package com.kdj.demo.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kdj.demo.calculator.service.CalcService;

public class CalcController {
	
	@Autowired
	private CalcService calcService;
	
//	public CalcController(CalcService calcService) {
//		this.calcService = calcService;
//	}
	
	@GetMapping("/add")
	public int add (@RequestParam int a, @RequestParam int b) {
		return calcService.add(a, b);
	}
}
