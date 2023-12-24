package com.project.subject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.subject.models.CompteRendu;
import com.project.subject.repositories.CompteRenduRepository;
@Service

public class CompteRenduService {
   @Autowired
CompteRenduRepository compterenduRepository;

public CompteRendu saveCompteRendu(CompteRendu cr){
return compterenduRepository.save(cr);
}
public CompteRendu updateCompteRendu(CompteRendu cr){
return compterenduRepository.save(cr);
}
public void deleteCompteRendu(Long id){
 compterenduRepository.deleteById(id);
}
public List<CompteRendu> getCompteRendus(){
return compterenduRepository.findAll();
}

public Optional<CompteRendu> getCompteRendu(Long id){
return compterenduRepository.findById(id);
}
 }
