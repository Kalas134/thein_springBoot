package com.kdj.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kdj.example.demo.mapper.MyMapper;
import com.kdj.example.demo.model.Member;

@Service
public class MyService {
	
	@Autowired
	private MyMapper myMapper;
	
	public List<Member> selectMember() {
		return myMapper.selectMember();
	}
}
