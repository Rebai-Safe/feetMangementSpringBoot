package com.fleetManagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fleetManagement.entities.Marque;
import com.fleetManagement.repositories.MarqueRepository;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class MarqueController {
	
	@Autowired
	MarqueRepository marqueRepository;

	
	@RequestMapping("/marques")
	public List<Marque> getMarques() {
		return marqueRepository.findAll();
	}

}
