package com.project.subject.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.project.subject.models.Matiere;
import com.project.subject.models.Support;
import java.util.List;
import java.util.Optional;



public interface SupportRepository extends JpaRepository<Support, Long> {
   List<Support> findByMatiere(Matiere matiere);
   Optional<Support> findById(Long id);
List<Support> findAllByOrderByDateajout();

}
