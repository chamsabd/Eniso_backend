package com.project.subject.controllers;


import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.project.subject.models.Matiere;

import com.project.subject.services.MatiereService;

import lombok.extern.slf4j.Slf4j;



@RestController
@Slf4j
@RequestMapping("/matieres")
public class MatiereController {



    @Autowired
	private MatiereService mrepo;
	
	public static class MC {
	public Long idDepartement;
public Long idNiveau;
public MC(Long idDepartement, Long idNiveau) {
	this.idDepartement = idDepartement;
	this.idNiveau = idNiveau;
}	

	}

	 @PostMapping("/")
    public ResponseEntity<?> GetMatieres(@RequestBody MC mc ){
        log.info("Received request with idDepartement: {} and idNiveau: {}", mc.idDepartement, mc.idNiveau);
		List<Matiere> ms=mrepo.getMatieres(mc.idDepartement,mc.idNiveau);
        return new ResponseEntity<>(ms,HttpStatus.OK);
    }

     @GetMapping("/{id}")
    public ResponseEntity<?> GetMatiere(@PathVariable Long id){
        Matiere ms=mrepo.getMatiere(id).get();
        return new ResponseEntity<>(ms,HttpStatus.OK);
    }

 @GetMapping("/test/{id}")
    public Long test(@PathVariable Long id){
       Optional<Matiere> ms=mrepo.getMatiere(id);
	   log.info("matiere nom"+ms.get().toString());
        return id;
    }


@DeleteMapping("/{id}")
		public void deleteMatiere(@PathVariable Long id)
	{
				mrepo.deleteMatiere(id);
	}
	@PostMapping
	public ResponseEntity<?> saveMatiere(@RequestBody Matiere m) {
		mrepo.saveMatiere(m);
		return new ResponseEntity<>(m,HttpStatus.OK);
	}




	@PutMapping("/{id}")
    public ResponseEntity<?> updateMatiere(@PathVariable Long id, @RequestBody Matiere m) 
	{
		Matiere ma = mrepo.getMatiere(id).get();
			if (ma != null)
			{
				ma.setId(id);
                ma.setCredit(m.getCredit());
                ma.setModule(m.getModule());
                ma.setNom(m.getNom());
                ma.setProf(m.getProf());
                ma.setVH(m.getVH());
				mrepo.saveMatiere(ma);
				return new ResponseEntity<>(ma, HttpStatus.OK);
				
			}
					else 
						throw  new NoSuchElementException();
	
	}

}
