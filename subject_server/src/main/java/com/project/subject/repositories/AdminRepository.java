package com.project.subject.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.project.subject.models.Admin;
import java.util.List;
import java.util.Optional;



public interface AdminRepository extends JpaRepository<Admin, Long> {
    Optional<Admin> findByNcin(int ncin);
    Optional<Admin> findById(Long id);
    
}
