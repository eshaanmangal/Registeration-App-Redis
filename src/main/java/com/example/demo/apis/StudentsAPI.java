package com.example.demo.apis;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentsAPI {

    @Autowired
    private StudentService studentService;

    @GetMapping(path = "/test")
    public ResponseEntity<List<?>> test() {
        Student student = Student.builder()
                .name("Eshaan")
                .gender(Student.Gender.MALE)
                .build();

        studentService.save(student);
        List <Student> list=studentService.getAllStudents();
        return ResponseEntity.ok(list);
    }
}
