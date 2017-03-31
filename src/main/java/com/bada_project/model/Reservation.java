package com.bada_project.model;

import java.util.Set;

public class Reservation {

	private float code;
	private float dateModification;
	private String date;
	private int heure;
	private int duree;
	private String commentaire;
	private float codeProprietaire;
	private Set<LesRessources> ressourcesEnseignementsConcernes;
	
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
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public float getCodeProprietaire() {
		return codeProprietaire;
	}
	public void setCodeProprietaire(float codeProprietaire) {
		this.codeProprietaire = codeProprietaire;
	}
	public Set<LesRessources> getRessourcesEnseignementsConcernes() {
		return ressourcesEnseignementsConcernes;
	}
	public void setRessourcesEnseignementsConcernes(Set<LesRessources> ressourcesEnseignementsConcernes) {
		this.ressourcesEnseignementsConcernes = ressourcesEnseignementsConcernes;
	}
	
}
