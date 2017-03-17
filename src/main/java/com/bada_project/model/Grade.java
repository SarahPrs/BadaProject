package com.bada_project.model;

import java.util.Date;
import java.util.Set;

public class Grade {
	
	private int code;
	private Date date_modification;
	private String nom;
	private int heures_statutaires;
	private int heures_complementaires;
	private Set<LesPonderations> les_ponderations;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public Date getDate_modification() {
		return date_modification;
	}
	public void setDate_modification(Date date_modification) {
		this.date_modification = date_modification;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getHeures_statutaires() {
		return heures_statutaires;
	}
	public void setHeures_statutaires(int heures_statutaires) {
		this.heures_statutaires = heures_statutaires;
	}
	public int getHeures_complementaires() {
		return heures_complementaires;
	}
	public void setHeures_complementaires(int heures_complementaires) {
		this.heures_complementaires = heures_complementaires;
	}
	public Set<LesPonderations> getLes_ponderations() {
		return les_ponderations;
	}
	public void setLes_ponderations(Set<LesPonderations> les_ponderations) {
		this.les_ponderations = les_ponderations;
	}
	
	
	

}
