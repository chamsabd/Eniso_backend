package com.project.subject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.subject.models.Matiere;
import com.project.subject.models.Module;
import com.project.subject.models.Niveau;

import java.util.List;
import java.util.Optional;

public interface ModuleRepository extends JpaRepository<Module, Long> {
   Optional<Module> findById(Long id);
   List<Module> findByNiveau(Niveau niveau);


   @Query("SELECT mo FROM  Module mo  " +
"JOIN Niveau n ON mo.niveau.id = n.id " +
"WHERE n.departement.id = ?1 AND n.id = ?2") 
  List<Module> findAll(Long idDepartement,Long idNiveau);
}
