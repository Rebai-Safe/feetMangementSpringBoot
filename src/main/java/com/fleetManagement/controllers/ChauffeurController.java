package com.fleetManagement.controllers;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fleetManagement.entities.AffectationChauffeur;
import com.fleetManagement.entities.Chauffeur;
import com.fleetManagement.entities.Vehicule;
import com.fleetManagement.repositories.ChauffeurRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ChauffeurController {
	
	@Autowired
	ChauffeurRepository chauffeurRepository;
	
	
	
	@RequestMapping("/chauffeurs")
	public List<Chauffeur> getChauffeurs() {
		return chauffeurRepository.findAll();
	}
	
	@GetMapping("/chauffeurs/{id}")
	public Optional<Chauffeur> getChauffeur(@PathVariable String id )  {
		
		return chauffeurRepository.findById(Integer.parseInt(id));
	}
	
	
	@GetMapping("/chauffeursCount")
	public Long getCountChauffeurs() {
	
		return chauffeurRepository.getCountChauffeurs();
	}

	
	@PostMapping("/chauffeursDispo")
	public List<Chauffeur> getChauffeurDispo(@RequestBody AffectationChauffeur chauffeur) {
		Date dateDeb = chauffeur.getDateDebut();
		return chauffeurRepository.getDispoChauffeur(dateDeb);
	}
	
	
	
	@PostMapping("/chauffeur")
	public void addChauffeur(@RequestBody Chauffeur chauffeur) {
		chauffeurRepository.save(chauffeur);
	}
	
	@PutMapping("/chauffeur")
	public void putChauffeur(@RequestBody Chauffeur chauffeur) {
		chauffeurRepository.save(chauffeur);
	}
	
	@DeleteMapping("/chauffeurs/{id}")
	public void deleteVehicule(@PathVariable String id) {
		chauffeurRepository.deleteById(Integer.parseInt(id));
	}

}
