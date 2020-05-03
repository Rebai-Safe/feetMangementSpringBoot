package com.fleetManagement.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fleetManagement.entities.Modele;



@Repository
public interface ModeleRepository extends JpaRepository<Modele, Integer>{
	
	@Query("select m from Modele m where m.idMarque.idMarque = :idMarque")
	List<Modele> getModelesByMarque(@Param("idMarque") Integer idMarque);

}
