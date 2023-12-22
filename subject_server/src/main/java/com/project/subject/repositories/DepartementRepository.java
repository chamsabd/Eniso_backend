package com.project.subject.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.project.subject.models.Departement;

import java.util.Optional;



public interface DepartementRepository extends JpaRepository<Departement, Long> {
   Optional<Departement> findById(Long id);
   
}
