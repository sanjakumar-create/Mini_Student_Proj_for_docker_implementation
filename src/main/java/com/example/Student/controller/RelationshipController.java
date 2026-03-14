package com.example.Student.controller;

import com.example.Student.model.Student;
import com.example.Student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class RelationshipController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/test-relationships")
    public List<Student> getFullDetails() {
        // This returns Students + University + Courses + Profile
        return studentService.getAllStudentsWithDetails();
    }
}