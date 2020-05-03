package com.fleetManagement.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fleetManagement.entities.TypeCarburant;
import com.fleetManagement.entities.Vehicule;


@Repository
public interface TypeCarburantRepository extends JpaRepository<TypeCarburant, Integer>{

}
