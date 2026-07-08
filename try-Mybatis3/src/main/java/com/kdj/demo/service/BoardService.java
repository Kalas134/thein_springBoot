package com.kdj.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kdj.demo.dto.BoardDTO;
import com.kdj.demo.repository.BoardRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {
	// DB 사용 준비
	private final BoardRepository boardRepository;
	
	public void save(BoardDTO dto) {
		boardRepository.save(dto);
	}
	
	public List<BoardDTO> findAll() {
		return boardRepository.findAll();
	}
}
