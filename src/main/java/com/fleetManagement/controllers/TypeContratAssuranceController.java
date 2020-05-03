package com.fleetManagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fleetManagement.entities.TypeContratAssurance;
import com.fleetManagement.repositories.TypeContratAssuranceRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TypeContratAssuranceController {
	
	@Autowired
	TypeContratAssuranceRepository typeContratAssuranceRepository;

	
	@RequestMapping("/typesContratAssurance")
	public List<TypeContratAssurance> getTypeCarburant() {
		return typeContratAssuranceRepository.findAll();
	}

}
