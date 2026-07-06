package com.kdj.demo.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalcService {

	public int addCalc(int a, int b) {
		return a + b;
	}

	public int subtractCalc(int a, int b) {
		return a - b;
	}

	public int multiplyCalc(int a, int b) {
		return a * b;
	}

	public int divideCalc(int a, int b) {
		return a / b;
	}

}
