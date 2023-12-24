package com.project.subject.services;




import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.subject.models.Matiere;
import com.project.subject.repositories.MatiereRepository;
@Service
public class MatiereService  {
@Autowired
MatiereRepository matiereRepository;

public Matiere saveMatiere(Matiere m){
return matiereRepository.save(m);
}
public Matiere updateMatiere(Matiere m){
return matiereRepository.save(m);
}
public void deleteMatiere(Long id){
 matiereRepository.deleteById(id);
}
public List<Matiere> getMatieres(Long idDepartement,Long idNiveau){
return matiereRepository.findAll(idDepartement,idNiveau);
}

public Optional<Matiere> getMatiere(Long id){
return matiereRepository.findById(id);
}
}
