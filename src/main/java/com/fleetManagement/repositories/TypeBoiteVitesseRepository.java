package com.fleetManagement.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fleetManagement.entities.TypeBoiteVitesse;


@Repository
public interface TypeBoiteVitesseRepository extends JpaRepository<TypeBoiteVitesse, Integer>{

}
