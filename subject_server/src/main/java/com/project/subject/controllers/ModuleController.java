package com.project.subject.controllers;



import java.lang.module.ResolutionException;
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

import com.project.subject.models.Module;

import com.project.subject.services.ModuleService;
 /**
  * InnerModuleController
  */

@RestController
@RequestMapping("/modules")
public class ModuleController {
    @Autowired
	private ModuleService nrepo;
	 @GetMapping("/")
    public ResponseEntity<?> GetModules(){
        List<Module> ms=nrepo.getModules();
        return new ResponseEntity<>(ms,HttpStatus.OK);
    }



     @GetMapping("/{id}")
    public ResponseEntity<?> GetModule(@PathVariable Long id){
        Module ms=nrepo.getModule(id).get();
        return new ResponseEntity<>(ms,HttpStatus.OK);
    }



@DeleteMapping("/{id}")
		public void deleteModule(@PathVariable Long id)
	{
				nrepo.deleteModule(id);
	}
	@PostMapping
	public ResponseEntity<?> saveModule(@RequestBody Module n) {
		nrepo.saveModule(n);
		return new ResponseEntity<>(n,HttpStatus.OK);
	}




	@PutMapping("/{id}")
    public ResponseEntity<?> updateModule(@PathVariable Long id, @RequestBody Module n) 
	{
		Module ne = nrepo.getModule(id).get();
			if (ne != null)
			{
				ne.setId(id);
                ne.setNiveau(n.getNiveau());
				ne.setNom(n.getNom());
			
                
				nrepo.saveModule(ne);
				return new ResponseEntity<>(ne, HttpStatus.OK);
				
			}
					else 
						throw  new NoSuchElementException();
	
	}

}
