package com.fleetManagement.controllers;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fleetManagement.beans.VehiculesByBrand;
import com.fleetManagement.entities.AffectationChauffeur;
import com.fleetManagement.entities.Vehicule;
import com.fleetManagement.repositories.VehiculeRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class VehiculeController {
	
	@Autowired
	VehiculeRepository vehiculeRepository;

	
	@RequestMapping("/vehicules")
	public List<Vehicule> getVehicules() {
		return vehiculeRepository.findAll();
	}
	
	
	
	
	@GetMapping("/vehicules/{id}")
	public Optional<Vehicule> getVehicule(@PathVariable String id )  {
		
		return vehiculeRepository.findById(Integer.parseInt(id));
	}
	
	@GetMapping("/vehiculesByBrand")
	public List<VehiculesByBrand> getVehiculesByBrand() {
		List<VehiculesByBrand> liste = new ArrayList<VehiculesByBrand>();
		liste = vehiculeRepository.getVehiculesByBrand();
		System.out.println("taille liste "+liste.size());
		return liste;
	
	}
	
	@GetMapping("/vehiculesCount")
	public Long getCountVehicules() {
	
		return vehiculeRepository.getCountVehicules();
	}
	
	
	@GetMapping("/vehiculesBroken")
	public Long getBrokenVehicules() {
	
		return vehiculeRepository.getBrokenVehicules("En panne");
	}
	
	@GetMapping("/globalCost")
	public BigDecimal golbalCost() {
	  return vehiculeRepository.golbalCost();
	}
	
	
	/*
	@GetMapping("/vehiculesDispo/{dateDeb}")
	public List<Vehicule> getVehiculeDispo(@PathVariable("dateDeb") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date dateDeb){
	
		
		return vehiculeRepository.getDispoVehicule(dateDeb);
	}
	*/
	
	@PostMapping("/vehiculesDispo")
	public List<Vehicule> getVehiculeDispo(@RequestBody AffectationChauffeur chauffeur) {
		Date dateDeb = chauffeur.getDateDebut();
		return vehiculeRepository.getDispoVehicule(dateDeb);
	}
	
	@PostMapping("/vehicules")
	public void addVehicule(@RequestBody Vehicule vehicule) {
		vehiculeRepository.save(vehicule);
	}
	
	@PutMapping("/vehicules")
	public void putVehicule(@RequestBody Vehicule vehicule) {
		vehiculeRepository.save(vehicule);
	}
	
	@DeleteMapping("/vehicules/{id}")
	public void deleteVehicule(@PathVariable String id) {
		vehiculeRepository.deleteById(Integer.parseInt(id));
	}
	
	@DeleteMapping("/vehicules")
	public void deleteVehicules() {
		vehiculeRepository.deleteAll();
	}
	
	
	
	
	
	
}
