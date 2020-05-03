package com.fleetManagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fleetManagement.entities.Etat;
import com.fleetManagement.repositories.EtatRepository;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EtatController {
	
	@Autowired
	EtatRepository etatRepository;

	
	@RequestMapping("/etats")
	public List<Etat> getEtats() {
		return etatRepository.findAll();
	}

}
