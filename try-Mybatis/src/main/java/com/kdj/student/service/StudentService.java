package com.kdj.student.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kdj.student.dto.Student;
import com.kdj.student.repository.StudentRepository;


@Service
public class StudentService {

//	public List<Student> findAll() {
//		
//		List<Student> list = new ArrayList<>();
//		
//		list.add(new Student(1, "홍길동", 20));
//		list.add(new Student(2, "이순신", 23));
//		list.add(new Student(3, "강감찬", 22));
//		
//		return list;
//	}
	
	private final StudentRepository repository;
	
	public StudentService(StudentRepository repository) {
		this.repository = repository;
	}
	
	public List<Student> findAll() {
		return repository.findAll();
	}

}
