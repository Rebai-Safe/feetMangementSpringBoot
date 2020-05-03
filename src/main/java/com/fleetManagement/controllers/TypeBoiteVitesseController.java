package com.fleetManagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fleetManagement.entities.TypeBoiteVitesse;

import com.fleetManagement.repositories.TypeBoiteVitesseRepository;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TypeBoiteVitesseController {
	
	@Autowired
	TypeBoiteVitesseRepository typeBoiteVitesseRepository;

	
	@RequestMapping("/typesBoite")
	public List<TypeBoiteVitesse> getTypeBoiteVitesse() {
		return typeBoiteVitesseRepository.findAll();
	}

}
