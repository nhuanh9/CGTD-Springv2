package com.example.demo.service;

import com.example.demo.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    List<Student> list = new ArrayList<>();

    public StudentService() {
        list.add(new Student(1, "A", 10));
        list.add(new Student(2, "B", 15));
    }

    public List<Student> findAll() {
        return list;
    }
}
