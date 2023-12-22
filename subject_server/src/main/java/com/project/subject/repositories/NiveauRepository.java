package com.project.subject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.subject.models.Departement;
import com.project.subject.models.Niveau;
import java.util.List;
import java.util.Optional;


public interface NiveauRepository extends JpaRepository<Niveau, Long> {
   List<Niveau> findByDepartement(Departement departement);
   Optional<Niveau> findById(Long id);
}
