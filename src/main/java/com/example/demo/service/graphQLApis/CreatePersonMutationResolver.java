package com.example.demo.service.graphQLApis;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreatePersonMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private StudentService studentService;

    public Student createStudent(String name, int grade, Student.Gender gender) {
        Student student = Student.builder()
                .name(name)
                .grade(grade)
                .gender(gender)
                .build();
        return student;
    }
}
