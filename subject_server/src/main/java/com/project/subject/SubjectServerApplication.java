package com.project.subject;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.subject.models.Admin;
import com.project.subject.repositories.AdminRepository;

@SpringBootApplication
public class SubjectServerApplication implements CommandLineRunner{
@Autowired 
	 AdminRepository adminRepository;
	public static void main(String[] args) {
		SpringApplication.run(SubjectServerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	Optional<Admin> a=adminRepository.findById(1L);
if (!a.isPresent()) {
	Admin ad=new Admin(1L,"admin.pnj",12547,"admin","admin","admin@gmail.com","admin",1254785);
	adminRepository.save(ad);
} 

	}

}
