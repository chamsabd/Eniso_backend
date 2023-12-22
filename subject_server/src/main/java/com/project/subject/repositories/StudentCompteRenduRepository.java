package com.project.subject.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.project.subject.models.Student;
import com.project.subject.models.StudentCompteRendu;
import java.util.List;
import java.util.Optional;
import java.sql.Date;



public interface StudentCompteRenduRepository extends JpaRepository<StudentCompteRendu, Long> {
   List<StudentCompteRendu> findByDateajout(Date date_ajout);
   Optional<StudentCompteRendu> findById(Long id);
   List<StudentCompteRendu> findByStudent(Student student);
}
