package com.example.backend.service.controller;

import com.example.backend.entity.Student;
import com.example.backend.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:8081/")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping ("/students")
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }



}
