package com.fleetManagement.repositories;

import java.math.BigDecimal;
import java.sql.Date;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.fleetManagement.beans.VehiculesByBrand;

import com.fleetManagement.entities.Vehicule;

@Repository
public interface VehiculeRepository extends JpaRepository<Vehicule, Integer>{
	
	  
	   
	   @Query("Select v from Vehicule v where not exists (select ch.idVehicule from AffectationChauffeur ch where dateFin > :dateDeb) ")
	   public List<Vehicule> getDispoVehicule(@Param("dateDeb") Date dateDeb);
	   
	   @Query("Select new com.fleetManagement.beans.VehiculesByBrand(ma.libelleMarque as libelleMarque , count(*) as nombre) from Vehicule v , Modele m , Marque ma where v.idModele.idModele = m.idModele and m.idMarque.idMarque = ma.idMarque group by ma.libelleMarque")
       public List<VehiculesByBrand> getVehiculesByBrand();

	   @Query("Select  count(*)  from Vehicule v  group by v.idVehicule")
       public Long getCountVehicules();
	   
	   @Query("Select  count(*)  from Vehicule v where v.idEtat.libelleEtat = :etat group by v.idVehicule ")
       public Long getBrokenVehicules(@Param("etat") String etat);

	   @Query("Select  sum(v.coutAcquisition)  from Vehicule v")
       public BigDecimal golbalCost();
  
}
