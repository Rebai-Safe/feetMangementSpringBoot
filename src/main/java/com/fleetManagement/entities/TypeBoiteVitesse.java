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
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.Id;


@Entity
@Table(name = "type_boite_vitesse")

public class TypeBoiteVitesse {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	    @Column(name = "id_type_boite")
	    private Integer idTypeBoite;
	    @Size(max = 45)
	    @Column(name = "code_boite")
	    private String codeBoite;
	    @Size(max = 45)
	    @Column(name = "libelle_boite")
	    private String libelleBoite;
	    @OneToMany(mappedBy = "idTypeBoite")
	    @JsonIgnore
	    private List<Vehicule> vehiculeList;
		
	    public Integer getIdTypeBoite() {
			return idTypeBoite;
		}
		public void setIdTypeBoite(Integer idTypeBoite) {
			this.idTypeBoite = idTypeBoite;
		}
		public String getCodeBoite() {
			return codeBoite;
		}
		public void setCodeBoite(String codeBoite) {
			this.codeBoite = codeBoite;
		}
		public String getLibelleBoite() {
			return libelleBoite;
		}
		public void setLibelleBoite(String libelleBoite) {
			this.libelleBoite = libelleBoite;
		}
		public List<Vehicule> getVehiculeList() {
			return vehiculeList;
		}
		public void setVehiculeList(List<Vehicule> vehiculeList) {
			this.vehiculeList = vehiculeList;
		}
		

	    
	    
	    
	    
}
