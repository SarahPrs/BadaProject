package com.bada_project.model;

import java.util.Set;

public class UnEnseignant {

	private long code ;
	private long dateModification ;
	private String nom ;
	private String alias ;
	private int typeActivite ;
	private int composante ;
	private int niveau ;
	private int codeProprietaire ;
	private int couleur ;
	private int couleurPolice ;
	private long codeMatiere ;
	private int dureeTotale ;
	private int dureeChaqueSeance ;
	private int volumeReparti ;
	private int forfaitaire ;
	private int article6 ;
	private int volumeForfaitaire ;
	private int dateDebut ;
	private int dateFin ;
	private int typePublic ;
	private int nbSeancesHebdo ;
	private long codeTypeSalle ;
	private long codeZoneSalle ;
	private Set<LesRessources> lesRessources ;
	
	public UnEnseignant(){};
	
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
	public int getTypeActivite() {
		return typeActivite;
	}
	public void setTypeActivite(int typeActivite) {
		this.typeActivite = typeActivite;
	}
	public int getComposante() {
		return composante;
	}
	public void setComposante(int composante) {
		this.composante = composante;
	}
	public int getNiveau() {
		return niveau;
	}
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	public int getCodeProprietaire() {
		return codeProprietaire;
	}
	public void setCodeProprietaire(int codeProprietaire) {
		this.codeProprietaire = codeProprietaire;
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
	public long getCodeMatiere() {
		return codeMatiere;
	}
	public void setCodeMatiere(long codeMatiere) {
		this.codeMatiere = codeMatiere;
	}
	public int getDureeTotale() {
		return dureeTotale;
	}
	public void setDureeTotale(int dureeTotale) {
		this.dureeTotale = dureeTotale;
	}
	public int getDureeChaqueSeance() {
		return dureeChaqueSeance;
	}
	public void setDureeChaqueSeance(int dureeChaqueSeance) {
		this.dureeChaqueSeance = dureeChaqueSeance;
	}
	public int getVolumeReparti() {
		return volumeReparti;
	}
	public void setVolumeReparti(int volumeReparti) {
		this.volumeReparti = volumeReparti;
	}
	public int getForfaitaire() {
		return forfaitaire;
	}
	public void setForfaitaire(int forfaitaire) {
		this.forfaitaire = forfaitaire;
	}
	public int getArticle6() {
		return article6;
	}
	public void setArticle6(int article6) {
		this.article6 = article6;
	}
	public int getVolumeForfaitaire() {
		return volumeForfaitaire;
	}
	public void setVolumeForfaitaire(int volumeForfaitaire) {
		this.volumeForfaitaire = volumeForfaitaire;
	}
	public int getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(int dateDebut) {
		this.dateDebut = dateDebut;
	}
	public int getDateFin() {
		return dateFin;
	}
	public void setDateFin(int dateFin) {
		this.dateFin = dateFin;
	}
	public int getTypePublic() {
		return typePublic;
	}
	public void setTypePublic(int typePublic) {
		this.typePublic = typePublic;
	}
	public int getNbSeancesHebdo() {
		return nbSeancesHebdo;
	}
	public void setNbSeancesHebdo(int nbSeancesHebdo) {
		this.nbSeancesHebdo = nbSeancesHebdo;
	}
	public long getCodeTypeSalle() {
		return codeTypeSalle;
	}
	public void setCodeTypeSalle(long codeTypeSalle) {
		this.codeTypeSalle = codeTypeSalle;
	}
	public long getCodeZoneSalle() {
		return codeZoneSalle;
	}
	public void setCodeZoneSalle(long codeZoneSalle) {
		this.codeZoneSalle = codeZoneSalle;
	}
	public Set<LesRessources> getLesRessources() {
		return lesRessources;
	}
	public void setLesRessources(Set<LesRessources> lesRessources) {
		this.lesRessources = lesRessources;
	}
	
}
