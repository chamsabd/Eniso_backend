package com.project.subject.repositories;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.subject.models.Matiere;
import com.project.subject.models.User;

import java.util.List;



public interface MatiereRepository extends JpaRepository< Matiere, Long> {

 Optional<Matiere> findById(Long id);
List<Matiere> findByProf(User prof);
 
List<Matiere> findByModule(Module module);

@Query("SELECT m FROM Matiere m " +
"JOIN Module mo ON m.module.id = mo.id " +
"JOIN Niveau n ON mo.niveau.id = n.id " +
"WHERE n.departement.id = ?1 AND n.id = ?2") 
  List<Matiere> findAll(Long idDepartement,Long idNiveau);

}
