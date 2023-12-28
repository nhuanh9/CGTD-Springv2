package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public ModelAndView getAll() {
        ModelAndView modelAndView = new ModelAndView("/index");
        List<Student> list = studentService.findAll();
        System.out.println(list);
        modelAndView.addObject("list", list);
        String name = "Như Anh";
        modelAndView.addObject("x", name);
        return modelAndView;
    }
}
