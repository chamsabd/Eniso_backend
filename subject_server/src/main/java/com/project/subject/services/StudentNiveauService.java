package com.project.subject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.subject.models.StudentNiveau;
import com.project.subject.repositories.StudentNiveauRepository;
@Service
public class StudentNiveauService {
      @Autowired
StudentNiveauRepository studentniveauRepository;

public StudentNiveau saveStudentNiveau(StudentNiveau m){
return studentniveauRepository.save(m);
}
public StudentNiveau updateStudentNiveau(StudentNiveau m){
return studentniveauRepository.save(m);
}
public void deleteStudentNiveau(Long id){
 studentniveauRepository.deleteById(id);
}
public List<StudentNiveau> getStudentNiveaus(){
return studentniveauRepository.findAll();
}

public Optional<StudentNiveau> getStudentNiveau(Long id){
return studentniveauRepository.findById(id);
}
   }
