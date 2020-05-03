package com.fleetManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fleetManagement.entities.TypeContratAssurance;




@Repository
public interface TypeContratAssuranceRepository extends JpaRepository<TypeContratAssurance, Integer> {

}
