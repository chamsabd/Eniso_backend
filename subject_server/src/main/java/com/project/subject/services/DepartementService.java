package com.project.subject.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.subject.models.Departement;
import com.project.subject.repositories.DepartementRepository;
@Service
public class DepartementService  {
   @Autowired
DepartementRepository departementRepository;

public Departement saveDepartement(Departement d){
return departementRepository.save(d);
}
public Departement updateDepartement(Departement d){
return departementRepository.save(d);
}
public void deleteDepartement(Long id){
 departementRepository.deleteById(id);
}
public List<Departement> getDepartements(){
return departementRepository.findAll();
}
public Optional<Departement> getDepartement(Long id){
return departementRepository.findById(id);
}
}
