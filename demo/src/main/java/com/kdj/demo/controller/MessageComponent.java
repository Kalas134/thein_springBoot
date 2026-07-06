package com.kdj.demo.controller;

import org.springframework.stereotype.Component;

@Component
public class MessageComponent {
	public String getMessage() {
		return "Component가 만든 메시지 입니다.";
	}
}
