package com.example.demo.repository;

import com.example.demo.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepo extends CrudRepository<Student,String> { }
