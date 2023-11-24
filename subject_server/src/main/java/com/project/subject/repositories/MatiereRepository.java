package com.project.subject.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.project.subject.models.Matiere;


public interface MatiereRepository extends JpaRepository<Matiere, Long> {
   
}
