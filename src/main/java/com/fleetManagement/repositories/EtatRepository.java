package com.fleetManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.fleetManagement.entities.Etat;

@Repository
public interface EtatRepository extends JpaRepository<Etat, Integer>{

}
