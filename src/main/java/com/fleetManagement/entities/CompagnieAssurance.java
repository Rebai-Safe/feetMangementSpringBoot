package com.fleetManagement.entities;

import javax.persistence.Entity;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.Id;

@Entity
@Table(name = "compagnie_assurance")

public class CompagnieAssurance {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	    @Column(name = "id_assurance")
	    private Integer idAssurance;
	    @Size(max = 45)
	    @Column(name = "code_assurance")
	    private String codeAssurance;
	    @Size(max = 45)
	    @Column(name = "libelle_assurance")
	    private String libelleAssurance;
	    @OneToMany(mappedBy = "idAssurance")
	    @JsonIgnore
	    private List<Vehicule> vehiculeList;
		
	    
	    
	    
	    
	    public Integer getIdAssurance() {
			return idAssurance;
		}
		public void setIdAssurance(Integer idAssurance) {
			this.idAssurance = idAssurance;
		}
		public String getCodeAssurance() {
			return codeAssurance;
		}
		public void setCodeAssurance(String codeAssurance) {
			this.codeAssurance = codeAssurance;
		}
		public String getLibelleAssurance() {
			return libelleAssurance;
		}
		public void setLibelleAssurance(String libelleAssurance) {
			this.libelleAssurance = libelleAssurance;
		}
		public List<Vehicule> getVehiculeList() {
			return vehiculeList;
		}
		public void setVehiculeList(List<Vehicule> vehiculeList) {
			this.vehiculeList = vehiculeList;
		}
	    
	  //--getters && setters
		
	    
		
		
	    
	    
	     
	    
	    
	    
	    

}
