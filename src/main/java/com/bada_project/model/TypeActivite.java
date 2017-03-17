package com.bada_project.model;

import java.util.Date;

public class TypeActivite {
	
	private int code;
	private String nom;
	private String alias;
	private int identifiant;
	private Date date_modification;
	private int couleur;
	private int couleur_police;
	private int code_proprietaire;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public int getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}
	public Date getDate_modification() {
		return date_modification;
	}
	public void setDate_modification(Date date_modification) {
		this.date_modification = date_modification;
	}
	public int getCouleur() {
		return couleur;
	}
	public void setCouleur(int couleur) {
		this.couleur = couleur;
	}
	public int getCouleur_police() {
		return couleur_police;
	}
	public void setCouleur_police(int couleur_police) {
		this.couleur_police = couleur_police;
	}
	public int getCode_proprietaire() {
		return code_proprietaire;
	}
	public void setCode_proprietaire(int code_proprietaire) {
		this.code_proprietaire = code_proprietaire;
	}
	
	
	
	

}
