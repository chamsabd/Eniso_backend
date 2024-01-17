package com.project.subject.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.subject.models.Prof;
import com.project.subject.repositories.ProfRepository;
@Service
public class ProfService   {
     @Autowired
ProfRepository profRepository;

public Prof saveProf(Prof m){
return profRepository.save(m);
}
public Prof updateProf(Prof m){
return profRepository.save(m);
}
public void deleteProf(Long id){
 profRepository.deleteById(id);
}
public List<Prof> getProfs(){
return profRepository.findAll();
}

public Optional<Prof> getProf(Long id){
return profRepository.findById(id);
}
   }
