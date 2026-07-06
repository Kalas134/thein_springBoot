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
		if (b == 0) {
			throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
		}
		return a / b;
	}

}
