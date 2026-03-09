package com.example.Student.controller;

import com.example.Student.model.Student;
import com.example.Student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// Good practice to version your API
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getstudents")
    public List<Student> getStudents() {
        return studentService.findAll();
    }

    @GetMapping("/addstudent")
    public String addStudent() {
        studentService.saveDefaultStudent();
        return "Student added successfully! View them at /getstudents";
    }
}