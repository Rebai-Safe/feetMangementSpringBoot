package com.fleetManagement.entities;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Id;

@Entity
@Table(name="VEHICULE")

//...

public class Vehicule {

	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE )
	@Column(name = "id_vehicule")
	private int idVehicule;
	
	@Column(name = "immatriculation")
    private String immatriculation;
	
    @Column(name = "date_mise_circulation")
   private Date dateMiseCirculation;
    
    @Column(name = "date_acquisition")
    private Date dateAcquisition;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
   
    @Column(name = "cout_acquisition")
    private BigDecimal coutAcquisition;
   
    @Column(name = "kilometrage_actuel")
    private BigDecimal kilometrageActuel;
   
    @Column(name = "numero_moteur")
    private Integer numeroMoteur;
   
    @Column(name = "numero_chassis")
    private Integer numeroChassis;
  
    @Column(name = "puissance")
    private Float puissance;
    
    @Column(name = "poid")
    private BigDecimal poid;
    
   
    
    
    //---join columns----
    
    
    @JoinColumn(name = "id_type_contrat_assurance", referencedColumnName = "id_type_contrat_assurance")
    @ManyToOne
   
    private TypeContratAssurance idTypeContratAssurance;
   
    
    @JoinColumn(name = "id_etat", referencedColumnName = "id_etat")
    @ManyToOne
   
    private Etat idEtat;
   
    
    @JoinColumn(name = "id_typecarburant", referencedColumnName = "id_typecarburant")
    @ManyToOne
    
    private TypeCarburant idTypecarburant;
   
    @JoinColumn(name = "id_type_boite", referencedColumnName = "id_type_boite")
    @ManyToOne
   
    private TypeBoiteVitesse idTypeBoite;
   
    @JoinColumn(name = "id_modele", referencedColumnName = "id_modele")
    @ManyToOne

    private Modele idModele;
    
    @JoinColumn(name = "id_assurance", referencedColumnName = "id_assurance")
    @ManyToOne
  
    private CompagnieAssurance idAssurance;
   
   
    @OneToMany(mappedBy = "idVehicule",cascade=CascadeType.REMOVE)
    @JsonIgnore
    private List<AffectationChauffeur> affectationChauffeurList;
    
  

    
    
    
  //---getters && setters 




	public String getImmatriculation() {
		return immatriculation;
	}


	public Etat getIdEtat() {
		return idEtat;
	}


	public void setIdEtat(Etat idEtat) {
		this.idEtat = idEtat;
	}


	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}


	public Date getDateMiseCirculation() {
		return dateMiseCirculation;
	}


	public void setDateMiseCirculation(Date dateMiseCirculation) {
		this.dateMiseCirculation = dateMiseCirculation;
	}


	public Date getDateAcquisition() {
		return dateAcquisition;
	}


	public void setDateAcquisition(Date dateAcquisition) {
		this.dateAcquisition = dateAcquisition;
	}


	public BigDecimal getCoutAcquisition() {
		return coutAcquisition;
	}


	public void setCoutAcquisition(BigDecimal coutAcquisition) {
		this.coutAcquisition = coutAcquisition;
	}


	public BigDecimal getKilometrageActuel() {
		return kilometrageActuel;
	}


	public void setKilometrageActuel(BigDecimal kilometrageActuel) {
		this.kilometrageActuel = kilometrageActuel;
	}


	public Integer getNumeroMoteur() {
		return numeroMoteur;
	}


	public void setNumeroMoteur(Integer numeroMoteur) {
		this.numeroMoteur = numeroMoteur;
	}


	public Integer getNumeroChassis() {
		return numeroChassis;
	}


	public void setNumeroChassis(Integer numeroChassis) {
		this.numeroChassis = numeroChassis;
	}




	public Float getPuissance() {
		return puissance;
	}


	public void setPuissance(Float puissance) {
		this.puissance = puissance;
	}


	public BigDecimal getPoid() {
		return poid;
	}


	public void setPoid(BigDecimal poid) {
		this.poid = poid;
	}


	public TypeContratAssurance getIdTypeContratAssurance() {
		return idTypeContratAssurance;
	}


	public void setIdTypeContratAssurance(TypeContratAssurance idTypeContratAssurance) {
		this.idTypeContratAssurance = idTypeContratAssurance;
	}


	public TypeCarburant getIdTypecarburant() {
		return idTypecarburant;
	}


	public void setIdTypecarburant(TypeCarburant idTypecarburant) {
		this.idTypecarburant = idTypecarburant;
	}


	public TypeBoiteVitesse getIdTypeBoite() {
		return idTypeBoite;
	}


	public void setIdTypeBoite(TypeBoiteVitesse idTypeBoite) {
		this.idTypeBoite = idTypeBoite;
	}


	public Modele getIdModele() {
		return idModele;
	}


	public void setIdModele(Modele idModele) {
		this.idModele = idModele;
	}


	public CompagnieAssurance getIdAssurance() {
		return idAssurance;
	}


	public void setIdAssurance(CompagnieAssurance idAssurance) {
		this.idAssurance = idAssurance;
	}


	public List<AffectationChauffeur> getAffectationChauffeurList() {
		return affectationChauffeurList;
	}


	public void setAffectationChauffeurList(List<AffectationChauffeur> affectationChauffeurList) {
		this.affectationChauffeurList = affectationChauffeurList;
	}


	

	public int getIdVehicule() {
		return idVehicule;
	}


	public void setIdVehicule(int idVehicule) {
		this.idVehicule = idVehicule;
	}



    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
