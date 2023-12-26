package com.project.subject.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.subject.models.StudentCompteRendu;
import com.project.subject.repositories.StudentCompteRenduRepository;


@Service

public class StudentCompteRenduService {
         @Autowired
StudentCompteRenduRepository studentcompterenduRepository;

public StudentCompteRendu saveStudentCompteRendu(StudentCompteRendu m){
return studentcompterenduRepository.save(m);
}
public StudentCompteRendu updateStudentCompteRendu(StudentCompteRendu m){
return studentcompterenduRepository.save(m);
}
public void deleteStudentCompteRendu(Long id){
 studentcompterenduRepository.deleteById(id);
}
public List<StudentCompteRendu> getStudentCompteRendus(){
return studentcompterenduRepository.findAll();
}

public Optional<StudentCompteRendu> getStudentCompteRendu(Long id){
return studentcompterenduRepository.findById(id);
}
   }
