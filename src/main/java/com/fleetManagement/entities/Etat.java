package com.fleetManagement.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "etat")

public class Etat {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.SEQUENCE)
		
	    @Column(name = "id_etat")
	    private Integer idEtat;
	    @Column(name="code_etat")
	    private String codeEtat;
	    @Column(name="libelle_etat")
	    private String  libelleEtat;
	    @OneToMany(mappedBy = "idEtat")
	    @JsonIgnore
	    private List<Vehicule> listVehicule;
	    
	    
	    //-----******-----****-----
		public Integer getIdEtat() {
			return idEtat;
		}
		public void setIdEtat(Integer idEtat) {
			this.idEtat = idEtat;
		}
		public String getCodeEtat() {
			return codeEtat;
		}
		public void setCodeEtat(String codeEtat) {
			this.codeEtat = codeEtat;
		}
		public String getLibelleEtat() {
			return libelleEtat;
		}
		public void setLibelleEtat(String libelleEtat) {
			this.libelleEtat = libelleEtat;
		}
		public List<Vehicule> getListVehicule() {
			return listVehicule;
		}
		public void setListVehicule(List<Vehicule> listVehicule) {
			this.listVehicule = listVehicule;
		}
	    
	    
	    
	    
	    
	    

}
