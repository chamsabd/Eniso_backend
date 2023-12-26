package com.project.subject;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.subject.models.Admin;
import com.project.subject.models.Departement;
import com.project.subject.models.Prof;
import com.project.subject.repositories.AdminRepository;
import com.project.subject.repositories.DepartementRepository;
import com.project.subject.repositories.ProfRepository;

@SpringBootApplication
public class SubjectServerApplication implements CommandLineRunner{
@Autowired 
	 AdminRepository adminRepository;
	 @Autowired 
	 ProfRepository profRepository;
	 @Autowired 
	 DepartementRepository dRepository;
	public static void main(String[] args) {
		SpringApplication.run(SubjectServerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	Optional<Admin> a=adminRepository.findById(1L);
if (!a.isPresent()) {
	Admin ad=new Admin(1L,"admin.pnj",12547,"admin","admin","admin@gmail.com","admin",1254785);
	adminRepository.save(ad);
	Departement d= new Departement("IA");
	dRepository.save(d);
	Prof p=new Prof(2L,"prof.pnj",12587,"prof1","prof1","prof@gmail.com","prof",d);
	profRepository.save(p);
} 

	}

}
