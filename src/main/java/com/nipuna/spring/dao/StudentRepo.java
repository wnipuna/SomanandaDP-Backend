package com.nipuna.spring.dao;

import org.springframework.data.repository.CrudRepository;

import com.nipuna.spring.models.Student;

public interface StudentRepo extends CrudRepository<Student, Integer> {

}
