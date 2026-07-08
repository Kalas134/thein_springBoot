package com.kdj.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kdj.example.demo.model.Member;

@Mapper
public interface MyMapper {
	List<Member> selectMember();
}
