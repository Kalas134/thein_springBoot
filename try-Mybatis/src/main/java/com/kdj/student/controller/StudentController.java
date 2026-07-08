package com.kdj.student.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kdj.student.dto.Student;
import com.kdj.student.service.StudentService;

@RestController
public class StudentController {
	
	private final StudentService service;
	
	public StudentController(StudentService service) {
		this.service = service;
	}
	
	@GetMapping("/students")
	public List<Student> student() {
		
		return service.findAll();
	}
}
