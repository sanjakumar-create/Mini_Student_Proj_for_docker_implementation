package com.example.Student.repository;

import com.example.Student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
        // Spring Data JPA automatically uses PreparedStatements for this
        List<Student> findByName(String name);

        // OR if using a custom query, use the colon (:) syntax
        @Query("SELECT s FROM Student s WHERE s.name = :name")
        List<Student> searchByName(@Param("name") String name);
    }
