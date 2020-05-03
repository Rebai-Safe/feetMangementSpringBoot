package com.fleetManagement.controllers;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BasicAuthController {
	
	@GetMapping(path = "/auth")
    public void basicauth() {
       System.out.println("utilisateur authentifié");
    }

}
