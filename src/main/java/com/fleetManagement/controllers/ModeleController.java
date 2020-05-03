package com.fleetManagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fleetManagement.entities.Modele;
import com.fleetManagement.repositories.ModeleRepository;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ModeleController {
	@Autowired
	ModeleRepository modeleRepository;

	
	@RequestMapping("/modeles")
	public List<Modele> getModeles() {
		return modeleRepository.findAll();
	}
	
	@RequestMapping("/modeles/{id}")
	public List<Modele> getModeles(@PathVariable String id){
		
		return modeleRepository.getModelesByMarque(Integer.parseInt(id));
		
	}

}
