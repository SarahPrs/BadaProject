package com.bada_project.model;

import java.util.Set;
import java.util.Date;

public class Seance {
	
	private float code;
	private float dateModification;
	private int enseignement;
	private String date;
	private int heure;
	private int duree;
	private float codeProprietaire;
	private Set<LesRessources> lesRessources;
	
	
	
	public Seance() {};
	
	public float getCode() {
		return code;
	}
	public void setCode(float code) {
		this.code = code;
	}
	public float getDateModification() {
		return dateModification;
	}
	public void setDateModification(float dateModification) {
		this.dateModification = dateModification;
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
	public Set<LesRessources> getLesRessources() {
		return lesRessources;
	}
	public void setLesRessources(Set<LesRessources> lesRessources) {
		this.lesRessources = lesRessources;
	}
	
}