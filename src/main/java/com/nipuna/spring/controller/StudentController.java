package com.nipuna.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nipuna.spring.dao.StudentRepo;
import com.nipuna.spring.models.Student;

@RestController
public class StudentController {

	@Autowired
	StudentRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "You are at home";
	}
	
	@RequestMapping(path="/students", produces="application/json")
	public List<Student> getStudents() {
		return (List<Student>) repo.findAll();
	}
	
	@RequestMapping(path="/student/{index}", produces="application/json")
	public Optional<Student> getStudent(@PathVariable("index") int index) {
		return repo.findById(index);
	}
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student) {
		repo.save(student);
		return student;
	}
	
	@PutMapping("/student")
	public Student updateStudent(@RequestBody Student student) {
		repo.save(student);
		return student;
	}
	
	@DeleteMapping("/student/{index}")
	public Optional<Student> deleteStudent(@PathVariable("index") int index) {
		Optional<Student> tempSt = repo.findById(index);
		repo.deleteById(index);
		return tempSt;
	}
}
