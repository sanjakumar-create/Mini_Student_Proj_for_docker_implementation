package com.example.Student.service;

import com.example.Student.model.Student;
import com.example.Student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public void saveDefaultStudent() {
        Student s = new Student(); // Created INSIDE method to be thread-safe
        s.setAge(21);
        s.setName("rajaji");
        studentRepository.save(s);
    }
}