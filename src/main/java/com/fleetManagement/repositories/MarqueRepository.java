package com.fleetManagement.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fleetManagement.entities.Marque;




@Repository
public interface MarqueRepository extends JpaRepository<Marque, Integer> {

}
