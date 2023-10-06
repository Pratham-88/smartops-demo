package com.example.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.Student;
import com.example.springboot.repository.StudentRepository;

@RestController
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	StudentRepository repository;
	
	@PostMapping("student")
	public void addStudent(@RequestBody Student stud) {
		
		repository.save(stud);
	}
	
	@GetMapping("student")
	public List<Student> getStudent(){
		return repository.findAll();
	}
	
	/*@GetMapping 
	public String getMessage() {
		return "Hello from Spring Boot";
	}
	
	@GetMapping("student")
	public List<Student> student() {
		List<Student> studList= new ArrayList<>();
		studList.add(new Student("Rahul", "Sharma", 112,"A+"));
		studList.add(new Student("Priya", "Mehta", 112,"A+"));
		studList.add(new Student("Sneha", "Patil", 112,"A+"));
		studList.add(new Student("Raj", "Verma", 112,"B+"));
		studList.add(new Student("David", "Miller", 112,"B"));
		return studList;
	}*/

}
