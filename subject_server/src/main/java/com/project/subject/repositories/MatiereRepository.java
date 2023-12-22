package com.project.subject.repositories;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.subject.models.Matiere;
import com.project.subject.models.User;

import java.util.List;



public interface MatiereRepository extends JpaRepository< Matiere, Long> {

 Optional<Matiere> findById(Long id);
List<Matiere> findByProf(User prof);
 
List<Matiere> findByModule(Module module);

}
