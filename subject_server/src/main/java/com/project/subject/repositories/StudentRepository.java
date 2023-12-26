package com.project.subject.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.project.subject.models.Student;
import java.util.List;
import java.util.Optional;



public interface StudentRepository extends JpaRepository<Student, Long> {
   Optional<Student> findByEmail(String email);
   Optional<Student> findById(Long id);
   Optional<Student> findByNcin(int ncin);
   
}
