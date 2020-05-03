package com.fleetManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fleetManagement.entities.AffectationChauffeur;


public interface AffectationRepository  extends JpaRepository<AffectationChauffeur, Integer>{

}
