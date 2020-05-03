package com.fleetManagement.entities;
import javax.persistence.Entity;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.Id;

@Entity
@Table(name = "modele")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id",scope = Modele.class)
public class Modele {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	    @Column(name = "id_modele")
	    private Integer idModele;
	    @Size(max = 45)
	    @Column(name = "code_modele")
	    private String codeModele;
	    @Size(max = 45)
	    @Column(name = "libelle_modele")
	    private String libelleModele;
	    
	    @OneToMany(mappedBy = "idModele")
	   
	    private List<Vehicule> vehiculeList;
	   
	    @JoinColumn(name = "id_marque")
	    @ManyToOne
	   
	    private Marque idMarque;
		
	    public Integer getIdModele() {
			return idModele;
		}
		public void setIdModele(Integer idModele) {
			this.idModele = idModele;
		}
		public String getCodeModele() {
			return codeModele;
		}
		public void setCodeModele(String codeModele) {
			this.codeModele = codeModele;
		}
		public String getLibelleModele() {
			return libelleModele;
		}
		public void setLibelleModele(String libelleModele) {
			this.libelleModele = libelleModele;
		}
		public List<Vehicule> getVehiculeList() {
			return vehiculeList;
		}
		public void setVehiculeList(List<Vehicule> vehiculeList) {
			this.vehiculeList = vehiculeList;
		}
		public Marque getIdMarque() {
			return idMarque;
		}
		public void setIdMarque(Marque idMarque) {
			this.idMarque = idMarque;
		}
	    
	    //--getters & setters
		
	    
	    
	    
	
	    
	    
	    
}
