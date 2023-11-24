package com.project.subject.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.project.subject.models.Niveau;

public interface NiveauRepository extends JpaRepository<Niveau, Long> {
   
}
