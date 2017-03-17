package com.bada_project.model;

import java.util.Date;

public class Cnu {
	
	private int code;
	private int section;
	private String nom;
	private int code_proprietaire;
	private Date date_modification;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getSection() {
		return section;
	}
	public void setSection(int section) {
		this.section = section;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getCode_proprietaire() {
		return code_proprietaire;
	}
	public void setCode_proprietaire(int code_proprietaire) {
		this.code_proprietaire = code_proprietaire;
	}
	public Date getDate_modification() {
		return date_modification;
	}
	public void setDate_modification(Date date_modification) {
		this.date_modification = date_modification;
	}
	
	

}
