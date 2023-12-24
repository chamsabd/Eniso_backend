package com.project.subject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.subject.models.Niveau;
import com.project.subject.repositories.NiveauRepository;
@Service

public class NiveauService {

   @Autowired
NiveauRepository niveauRepository;

public Niveau saveNiveau(Niveau v){
return niveauRepository.save(v);
}
public Niveau updateNiveau(Niveau v){
return niveauRepository.save(v);
}
public void deleteNiveau(Long id){
 niveauRepository.deleteById(id);
}
public List<Niveau> getNiveaus(){
return niveauRepository.findAll();
}

public Optional<Niveau> getNiveau(Long id){
return niveauRepository.findById(id);
}

  }
