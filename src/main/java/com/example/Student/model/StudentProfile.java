package com.example.Student.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "student_profiles")
public class StudentProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String address;
    private String bio;

    @JsonIgnore // Prevents the loop back to student
    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;

    public StudentProfile() {}

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getBio() { return bio; }
    public void setBio(String bio) { this.bio = bio; }
    public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }
}