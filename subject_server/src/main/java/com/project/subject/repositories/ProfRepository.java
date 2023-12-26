package com.project.subject.repositories;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.subject.models.Departement;
import com.project.subject.models.Prof;




public interface ProfRepository extends JpaRepository<Prof, Long> {
    Optional<Prof> findByNcin(int ncin);
    Optional<Prof> findById(Long id);
    Optional<Prof> findByDepartement(Departement departement);
}
