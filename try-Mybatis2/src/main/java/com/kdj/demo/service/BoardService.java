package com.kdj.demo.service;

import org.springframework.stereotype.Service;

import com.kdj.demo.repository.BoardRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {
	// DB 사용 준비
	private final BoardRepository boardRepository;
	
}
