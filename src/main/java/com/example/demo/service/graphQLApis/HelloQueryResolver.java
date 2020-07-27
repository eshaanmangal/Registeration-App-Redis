package com.example.demo.service.graphQLApis;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class HelloQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private StudentService studentService;

    public String hello(Optional<String> who) {
        return String.format("Hello %s", who.orElse("User"));
    }

    public List<Student> person(){
        return studentService.getAllStudents();
    }
}
