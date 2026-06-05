package com.example.dataJPAdemo.repository;

import com.example.dataJPAdemo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<Student,Integer> {
}
