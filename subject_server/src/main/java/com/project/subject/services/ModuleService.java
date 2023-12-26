package com.project.subject.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.subject.models.Module;
import com.project.subject.repositories.ModuleRepository;
@Service

public class ModuleService {
   @Autowired
ModuleRepository moduleRepository;

public Module saveModule(Module m){
return moduleRepository.save(m);
}
public Module updateModule(Module m){
return moduleRepository.save(m);
}
public void deleteModule(Long id){
 moduleRepository.deleteById(id);
}
public List<Module> getModules(){
return moduleRepository.findAll();
}

public Optional<Module> getModule(Long id){
return moduleRepository.findById(id);
}
  }
