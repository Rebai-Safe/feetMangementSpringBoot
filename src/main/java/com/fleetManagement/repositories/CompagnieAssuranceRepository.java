package com.fleetManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fleetManagement.entities.CompagnieAssurance;

@Repository
public interface CompagnieAssuranceRepository extends JpaRepository<CompagnieAssurance,Integer> {

}
