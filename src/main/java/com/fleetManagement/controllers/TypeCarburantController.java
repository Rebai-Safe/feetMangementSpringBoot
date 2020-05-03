package com.fleetManagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fleetManagement.entities.TypeCarburant;
import com.fleetManagement.repositories.TypeCarburantRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TypeCarburantController {
	
	
	@Autowired
	TypeCarburantRepository typeCarburantRepository;

	
	@RequestMapping("/typesCarburant")
	public List<TypeCarburant> getTypeCarburant() {
		return typeCarburantRepository.findAll();
	}

}
