package com.bada_project.model;

public class Niveau {
	private int code;
	private String dateModification;
	private String nom;
	private String alias;
	private String commentaire;
	private int identifiant;
	private int couleur;
	private int couleurPolice;
	private int codeProprietaire;
	private int typeElement;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getDateModification() {
		return dateModification;
	}
	public void setDateModification(String dateModification) {
		this.dateModification = dateModification;
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
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public int getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}
	public int getCouleur() {
		return couleur;
	}
	public void setCouleur(int couleur) {
		this.couleur = couleur;
	}
	public int getCouleurPolice() {
		return couleurPolice;
	}
	public void setCouleurPolice(int couleurPolice) {
		this.couleurPolice = couleurPolice;
	}
	public int getCodeProprietaire() {
		return codeProprietaire;
	}
	public void setCodeProprietaire(int codeProprietaire) {
		this.codeProprietaire = codeProprietaire;
	}
	public int getTypeElement() {
		return typeElement;
	}
	public void setTypeElement(int typeElement) {
		this.typeElement = typeElement;
	}
}
