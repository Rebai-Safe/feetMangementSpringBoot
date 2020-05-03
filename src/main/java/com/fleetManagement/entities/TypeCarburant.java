package com.fleetManagement.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "type_carburant")

public class TypeCarburant {
	    @Id
	    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	    @Column(name = "id_typecarburant")
	    private Integer idTypeCarburant;
	    @Size(max = 45)
	    @Column(name = "code_carburant")
	    private String code_carburant;
	    @Size(max = 45)
	    @Column(name = "libelle_carburant")
	    private String libelle_carburant;
	    
	    @OneToMany(mappedBy = "idTypecarburant")
	    @JsonIgnore
	    private List<Vehicule> vehiculeList;
		
	    public Integer getIdTypeCarburant() {
			return idTypeCarburant;
		}
		public void setIdTypeCarburant(Integer idTypeCarburant) {
			this.idTypeCarburant = idTypeCarburant;
		}
		public String getCode_carburant() {
			return code_carburant;
		}
		public void setCode_carburant(String code_carburant) {
			this.code_carburant = code_carburant;
		}
		public String getLibelle_carburant() {
			return libelle_carburant;
		}
		public void setLibelle_carburant(String libelle_carburant) {
			this.libelle_carburant = libelle_carburant;
		}
		public List<Vehicule> getVehiculeList() {
			return vehiculeList;
		}
		public void setVehiculeList(List<Vehicule> vehiculeList) {
			this.vehiculeList = vehiculeList;
		}
		
	    

}
