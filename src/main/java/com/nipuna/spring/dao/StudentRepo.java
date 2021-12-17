package com.nipuna.spring.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.nipuna.spring.models.Student;

public interface StudentRepo extends CrudRepository<Student, Integer> {
	
	List<Student> findByisCurrent(byte status);
}
