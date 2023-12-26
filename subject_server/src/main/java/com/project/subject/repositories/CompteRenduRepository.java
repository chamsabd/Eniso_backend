package com.project.subject.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.project.subject.models.CompteRendu;
import com.project.subject.models.Matiere;

import java.util.Optional;
import java.util.List;




public interface CompteRenduRepository extends JpaRepository<CompteRendu, Long> {
   Optional<CompteRendu> findById(Long id);
   List<CompteRendu> findByMatiere(Matiere matiere);
}
