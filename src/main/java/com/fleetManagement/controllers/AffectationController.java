package com.fleetManagement.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fleetManagement.entities.AffectationChauffeur;
import com.fleetManagement.entities.Chauffeur;
import com.fleetManagement.entities.Vehicule;
import com.fleetManagement.repositories.AffectationRepository;
import com.fleetManagement.repositories.ChauffeurRepository;
import com.fleetManagement.repositories.VehiculeRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AffectationController {
	
	@Autowired
	AffectationRepository affectationRepository;
	
	@Autowired
	VehiculeRepository vehiculeRepository;
	
	
	@Autowired
	ChauffeurRepository chauffeurRepository;
	
	
	@RequestMapping("/affectations")
	public List<AffectationChauffeur> getAffectations() {
		return affectationRepository.findAll();
	}
	
	
	@GetMapping("/affectation/{id}")
	public Optional<AffectationChauffeur> getAffectationChauffeur(@PathVariable String id )  {
		
		return affectationRepository.findById(Integer.parseInt(id));
	}
	
	
	@PostMapping("/affectation")
	public void addAffectation(@RequestBody AffectationChauffeur affectation) {
		affectationRepository.save(affectation);
		
  }
	
	@DeleteMapping("/affectation/{id}")
	public void deleteAffectation(@PathVariable String id) {
		affectationRepository.deleteById(Integer.parseInt(id));
	}
	
	

}
