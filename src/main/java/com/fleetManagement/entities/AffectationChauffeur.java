package com.fleetManagement.entities;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@Entity
@Table(name = "affectation_chauffeur")

public class AffectationChauffeur {
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_affectation")
    private Integer id_affectation ;
    
	@Column(name = "date_debut")
    private Date dateDebut;
   
    @Column(name = "date_fin")
    private Date dateFin;
    
    @JoinColumn(name = "id_chauffeur", referencedColumnName = "id_chauffeur")
    @ManyToOne
    private Chauffeur idChauffeur;
   
    @JoinColumn(name = "id_vehicule", referencedColumnName = "id_vehicule")
    @ManyToOne
    private Vehicule idVehicule;

	

	public Integer getId_affectation() {
		return id_affectation;
	}

	public void setId_affectation(Integer id_affectation) {
		this.id_affectation = id_affectation;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public Chauffeur getIdChauffeur() {
		return idChauffeur;
	}

	public void setIdChauffeur(Chauffeur idChauffeur) {
		this.idChauffeur = idChauffeur;
	}

	public Vehicule getIdVehicule() {
		return idVehicule;
	}

	public void setIdVehicule(Vehicule idVehicule) {
		this.idVehicule = idVehicule;
	}
    
    
    
    
    
    
}
