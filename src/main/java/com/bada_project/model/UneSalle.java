package com.bada_project.model;

public class UneSalle {

	private long code ;
	private long dateModification ;
	private String nom ;
	private String alias ;
	private String Commentaire ;
	private int composante ;
	private int capacite ;
	private int surface ;
	private int couleur ;
	private int couleurPolice ;
	private long codeProprietaire ;
	private long codeZone ;

	public UneSalle(){}

	public long getCode() {
		return code;
	}

	public void setCode(long code) {
		this.code = code;
	}

	public long getDateModification() {
		return dateModification;
	}

	public void setDateModification(long dateModification) {
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
		return Commentaire;
	}

	public void setCommentaire(String commentaire) {
		Commentaire = commentaire;
	}

	public int getComposante() {
		return composante;
	}

	public void setComposante(int composante) {
		this.composante = composante;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	public int getSurface() {
		return surface;
	}

	public void setSurface(int surface) {
		this.surface = surface;
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

	public long getCodeProprietaire() {
		return codeProprietaire;
	}

	public void setCodeProprietaire(long codeProprietaire) {
		this.codeProprietaire = codeProprietaire;
	}

	public long getCodeZone() {
		return codeZone;
	}

	public void setCodeZone(long codeZone) {
		this.codeZone = codeZone;
	}

	
	
}
