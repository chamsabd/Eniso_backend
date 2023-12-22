package com.project.subject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.subject.models.Module;
import com.project.subject.models.Niveau;

import java.util.List;
import java.util.Optional;

public interface ModuleRepository extends JpaRepository<Module, Long> {
   Optional<Module> findById(Long id);
   List<Module> findByNiveau(Niveau niveau);
}
