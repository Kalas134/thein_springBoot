package com.kdj.demo.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kdj.demo.calculator.service.CalcService;

@RestController
public class CalcController {
	
////A.자바방식의 개발자가 직접 Obj를 관리는 방식
//	private CalcService calcService = new CalcService();
//	
//	@GetMapping("/add")
//	public String add(@RequestParam int a, @RequestParam int b) {
//		// 서비스단에서 구현해야할 계산 알고리즘.
//		int result = a + b;
//		return "비즈니스 로직을 직접 구현해서 값을 주는 방식: " + result ;
//	}
	
//	B. 스프링 방식: DI1: @Autowired 방식
//	@Autowired
//	private CalcService calcService;
	
//	----------------
//	C. 스프링 방식: setMethod를 이용한 서비스단 사용방식
//	private CalcService calcService;
//	
//	public void setCalc(CalcService calcService) {
//		this.calcService = calcService;
//	}
	
//	D. 스프링 방식: 생성자를 이용한 서비스단 사용방식
	
	private final CalcService calcService;
	
	public CalcController(CalcService calcService) {
		this.calcService = calcService;
	}
	
	// http://localhost:8081/add-calc?a=10&b=20
	@GetMapping("/add-calc")
	public int addCalc(@RequestParam int a, @RequestParam int b) {
		return calcService.addCalc(a, b);
	}
	
	@GetMapping("/subtract-calc")
	public int subtractCalc (@RequestParam int a, @RequestParam int b) {
		return calcService.subtractCalc(a, b);
	}
	
	@GetMapping("/multiply-calc")
	public int multiplyCalc (@RequestParam int a, @RequestParam int b) {
		return calcService.multiplyCalc(a, b);
	}
	
	@GetMapping("/divide-calc")
	public int divideCalc (@RequestParam int a, @RequestParam int b) {
		return calcService.divideCalc(a, b);
	}
}
