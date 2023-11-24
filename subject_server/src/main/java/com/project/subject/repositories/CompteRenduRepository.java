package com.project.subject.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.project.subject.models.CompteRendu;


public interface CompteRenduRepository extends JpaRepository<CompteRendu, Long> {
   
}
