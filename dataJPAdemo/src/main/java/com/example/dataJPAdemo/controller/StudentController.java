package com.example.dataJPAdemo.controller;

import com.example.dataJPAdemo.model.Student;
import com.example.dataJPAdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService s;
    @GetMapping("students")
    public List<Student> getAllStudents(){
        return  s.getAllStudents();
    }
}
