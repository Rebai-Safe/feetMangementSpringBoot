package com.fleetManagement.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "chauffeur")
public class Chauffeur {
	    @Id
	    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	    @Column(name = "id_chauffeur")
	    private Integer idChauffeur;
	    @Size(max = 45)
	    @Column(name = "nom")
	    private String nom;
	    @Size(max = 45)
	    @Column(name = "prenom")
	    private String prenom;
	    @Column(name = "cin")
	    private Integer cin;
	   
	    @Column(name = "date_validite_permis")
	    private Date dateValiditePermis;
	    
	    @OneToMany(mappedBy = "idChauffeur",cascade=CascadeType.REMOVE)
	    private List<AffectationChauffeur> affectationChauffeurList;
		
	   
		
		
		public Integer getIdChauffeur() {
			return idChauffeur;
		}
		public void setIdChauffeur(Integer idChauffeur) {
			this.idChauffeur = idChauffeur;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		public Integer getCin() {
			return cin;
		}
		public void setCin(Integer cin) {
			this.cin = cin;
		}
		public Date getDateValiditePermis() {
			return dateValiditePermis;
		}
		public void setDateValiditePermis(Date dateValiditePermis) {
			this.dateValiditePermis = dateValiditePermis;
		}
		
		
	
		
	
		
	
	    
	    
	    
	    

}
