package com.project.subject.services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.subject.models.Support;
import com.project.subject.repositories.SupportRepository;
@Service
public class SupportService {
    @Autowired
SupportRepository supportRepository;

public Support saveSupport(Support m){
return supportRepository.save(m);
}
public Support updateSupport(Support m){
return supportRepository.save(m);
}
public void deleteSupport(Long id){
 supportRepository.deleteById(id);
}
public List<Support> getSupports(){
return supportRepository.findAll();
}

public Optional<Support> getSupport(Long id){
return supportRepository.findById(id);
}
  }
