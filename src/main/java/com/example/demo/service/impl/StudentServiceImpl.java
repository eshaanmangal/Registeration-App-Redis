package com.example.demo.service.impl;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentsRepo;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentsRepo studentsRepo;

    @Override
    public void save(Student student) {
        studentsRepo.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        List <Student> listStudents = new ArrayList<>();
        studentsRepo.findAll().forEach(listStudents::add);
        return listStudents;
    }
}
