package com.fleetManagement.repositories;

import java.sql.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.fleetManagement.entities.Chauffeur;
import com.fleetManagement.entities.AffectationChauffeur;


@Repository
public interface ChauffeurRepository extends JpaRepository<Chauffeur, Integer> {
	
	   @Query("Select c from Chauffeur c where not exists (select ch.idChauffeur from AffectationChauffeur ch where dateFin > :dateDeb)")
	   public List<Chauffeur> getDispoChauffeur(@Param("dateDeb") Date dateDeb);

	   
	   @Query("Select  count(*)  from Chauffeur Ch  group by ch.idChauffeur")
       public Long getCountChauffeurs();

}
