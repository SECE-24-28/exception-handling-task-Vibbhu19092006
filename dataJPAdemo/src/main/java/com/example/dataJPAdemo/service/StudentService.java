package com.example.dataJPAdemo.service;

import com.example.dataJPAdemo.model.Student;
import com.example.dataJPAdemo.repository.Repo;

import java.util.List;

public class StudentService {
    Repo r;
    public List<Student> getAllStudents() {
        return r.findAll();
    }
}
