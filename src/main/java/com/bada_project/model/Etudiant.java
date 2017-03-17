package com.bada_project.model;

public class Etudiant {

	private float code;
	private float dateModification;
	private String nom;
	private String prenom;
	private String prenom2;
	private int naissance;
	private int identifiant;
	private int boursier;
	private int composante;
	private String mail;
	private int typePublic;
	private int codeProprietaire;
	
	public Etudiant (){}

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

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getPrenom2() {
		return prenom2;
	}

	public void setPrenom2(String prenom2) {
		this.prenom2 = prenom2;
	}

	public int getNaissance() {
		return naissance;
	}

	public void setNaissance(int naissance) {
		this.naissance = naissance;
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public int getBoursier() {
		return boursier;
	}

	public void setBoursier(int boursier) {
		this.boursier = boursier;
	}

	public int getComposante() {
		return composante;
	}

	public void setComposante(int composante) {
		this.composante = composante;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getTypePublic() {
		return typePublic;
	}

	public void setTypePublic(int typePublic) {
		this.typePublic = typePublic;
	}

	public int getCodeProprietaire() {
		return codeProprietaire;
	}

	public void setCodeProprietaire(int codeProprietaire) {
		this.codeProprietaire = codeProprietaire;
	};
	
	
	
}