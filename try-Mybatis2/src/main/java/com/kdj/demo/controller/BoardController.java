package com.kdj.demo.controller;

import org.springframework.stereotype.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

import com.kdj.demo.dto.BoardDTO;
import com.kdj.demo.service.BoardService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
@RequiredArgsConstructor
public class BoardController {
	// 생성자 주입 방식
	// Model 사용 준비
	private final BoardService boardService;
	
	@GetMapping("/save")
	public String save() {
		return "save";
	}
	
	@PostMapping("/save")
	public String save(BoardDTO boardDTO) {
		System.out.println("----- 콘솔값 확인 -----");
		System.out.println("DTO = " + boardDTO);
		return "index";
	}
	
	
}
