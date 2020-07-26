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

    @GetMapping(path = "/saveUser")
    public ResponseEntity saveUser(@RequestParam(name = "User Full Name" , required = true) String fullName,
                                        @RequestParam (name = "Email ID") String emailId,
                                        @RequestParam (name = "Gender") String gender) {
        Student student = Student.builder()
                .name(fullName)
                .id(emailId)
                .build();

        Student savedUser = studentService.save(student);
        return ResponseEntity.ok(savedUser);
    }

    @GetMapping("/getUsers")
    public ResponseEntity<List<?>> getAllUsers(){
        return ResponseEntity.ok(studentService.getAllStudents());
    }
}
