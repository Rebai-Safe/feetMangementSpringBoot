package com.fleetManagement.repositories;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fleetManagement.entities.AffectationChauffeur;
import com.fleetManagement.entities.Vehicule;

@Repository
public interface VehiculeRepository extends JpaRepository<Vehicule, Integer>{
	
	  
	   
	   @Query("Select v from Vehicule v where not exists (select ch.idVehicule from AffectationChauffeur ch where dateFin > :dateDeb) ")
	   public List<Vehicule> getDispoVehicule(@Param("dateDeb") Date dateDeb);

}
