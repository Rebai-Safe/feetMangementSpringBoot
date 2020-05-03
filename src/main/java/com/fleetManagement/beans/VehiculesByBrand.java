package com.fleetManagement.beans;

public class VehiculesByBrand {
	private String libelleMarque;
	private Long nombre;
	
	
	
	public VehiculesByBrand(String libelleMarque, Long nombre) {
		this.libelleMarque = libelleMarque;
		this.nombre = nombre;
	}
	
	public String getLibelleMarque() {
		return libelleMarque;
	}
	public void setLibelleMarque(String libelleMarque) {
		this.libelleMarque = libelleMarque;
	}
	public Long getNombre() {
		return nombre;
	}
	public void setNombre(Long nombre) {
		this.nombre = nombre;
	}
	
	

}
