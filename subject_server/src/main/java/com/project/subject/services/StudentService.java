package com.project.subject.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.subject.models.Student;
import com.project.subject.repositories.StudentRepository;
@Service
public class StudentService  {
       @Autowired
StudentRepository studentRepository;

public Student saveStudent(Student m){
return studentRepository.save(m);
}
public Student updateStudent(Student m){
return studentRepository.save(m);
}
public void deleteStudent(Long id){
 studentRepository.deleteById(id);
}
public List<Student> getStudents(){
return studentRepository.findAll();
}

public Optional<Student> getStudent(Long id){
return studentRepository.findById(id);
}
}
