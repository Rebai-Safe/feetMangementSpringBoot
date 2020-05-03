package com.fleetManagement.entities;

import javax.persistence.Entity;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.Id;

@Entity
@Table(name = "type_contrat_assurance")
public class TypeContratAssurance {

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_type_contrat_assurance")
    private Integer idTypeContratAssurance;
   
	@Size(max = 45)
    @Column(name = "code_assurance")
    private String code_assurance;
    @Size(max = 45)
    @Column(name = "libelle_assurance")
    private String libelle_assurance;
    @OneToMany(mappedBy = "idTypeContratAssurance")
    
    @JsonIgnore
    private List<Vehicule> vehiculeList;
	
    
    public Integer getIdTypeContratAssurance() {
		return idTypeContratAssurance;
	}
	public void setIdTypeContratAssurance(Integer idTypeContratAssurance) {
		this.idTypeContratAssurance = idTypeContratAssurance;
	}
	public String getCode_assurance() {
		return code_assurance;
	}
	public void setCode_assurance(String code_assurance) {
		this.code_assurance = code_assurance;
	}
	public String getLibelle_assurance() {
		return libelle_assurance;
	}
	public void setLibelle_assurance(String libelle_assurance) {
		this.libelle_assurance = libelle_assurance;
	}
	public List<Vehicule> getVehiculeList() {
		return vehiculeList;
	}
	public void setVehiculeList(List<Vehicule> vehiculeList) {
		this.vehiculeList = vehiculeList;
	}
	
   
    
    
    
    
}
