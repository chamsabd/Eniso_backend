package com.project.subject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.subject.models.Admin;
import com.project.subject.repositories.AdminRepository;




@Service
public class AdminService {
  @Autowired
AdminRepository adminRepository;

public Admin saveAdmin(Admin m){
return adminRepository.save(m);
}
public Admin updateAdmin(Admin m){
return adminRepository.save(m);
}
public void deleteAdmin(Long id){
 adminRepository.deleteById(id);
}
public List<Admin> getAdmins(){
return adminRepository.findAll();
}

public Optional<Admin> getAdmin(Long id){
return adminRepository.findById(id);
}
}
