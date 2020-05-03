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

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.Id;

@Entity
@Table(name = "marque")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id",scope = Marque.class)
public class Marque {
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_marque")
    private Integer idMarque;
    @Size(max = 45)
    @Column(name = "libelle_marque")
    private String libelleMarque;
    @Size(max = 45)
    @Column(name = "code_marque")
    private String codeMarque;
    @OneToMany(mappedBy = "idMarque")
    private List<Modele> modeleList;
    
	public Integer getIdMarque() {
		return idMarque;
	}
	public void setIdMarque(Integer idMarque) {
		this.idMarque = idMarque;
	}
	public String getLibelleMarque() {
		return libelleMarque;
	}
	public void setLibelleMarque(String libelleMarque) {
		this.libelleMarque = libelleMarque;
	}
	public String getCodeMarque() {
		return codeMarque;
	}
	public void setCodeMarque(String codeMarque) {
		this.codeMarque = codeMarque;
	}
	public List<Modele> getModeleList() {
		return modeleList;
	}
	public void setModeleList(List<Modele> modeleList) {
		this.modeleList = modeleList;
	}
    
    
   
    
    

}
