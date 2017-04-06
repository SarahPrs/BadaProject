package com.bada_project.model;

import org.springframework.data.mongodb.core.mapping.Field;

public class Seance {
	
	@Field("code")
	private float code;
	@Field("ENSEIGNEMENT")
	private int enseignement;
	@Field("DATE")
	private String date;
	@Field("HEURE")
	private int heure;
	@Field("DUREE")
	private int duree;
	@Field("CODE_PROPRIETAIRE")
	private float codeProprietaire;
	
	public Seance() {};
	
	public float getCode() {
		return code;
	}
	public void setCode(float code) {
		this.code = code;
	}
	public int getEnseignement() {
		return enseignement;
	}
	public void setEnseignement(int enseignement) {
		this.enseignement = enseignement;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getHeure() {
		return heure;
	}
	public void setHeure(int heure) {
		this.heure = heure;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public float getCodeProprietaire() {
		return codeProprietaire;
	}
	public void setCodeProprietaire(float codeProprietaire) {
		this.codeProprietaire = codeProprietaire;
	}
	
}