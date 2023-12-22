package com.project.subject.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.project.subject.models.Student;
import com.project.subject.models.StudentNiveau;
import java.util.List;
import java.util.Optional;



public interface StudentNiveauRepository extends JpaRepository<StudentNiveau, Long> {
   List<StudentNiveau> findByAnnees(String annees);
   Optional<StudentNiveau> findById(Long id);
   List<StudentNiveau> findByStudent(Student student);
}
