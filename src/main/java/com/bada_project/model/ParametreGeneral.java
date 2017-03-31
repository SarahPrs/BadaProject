package com.bada_project.model;

import java.util.Date;

public class ParametreGeneral {
	private String Nom;
	private int HeureDebut;
	private int HeureFin;
	private int GrainTemporel;
	private Date DateDebut;
	private Date Datefin;
	private String MatiereV2;
	private Calendrier Calendrier;
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public int getHeureDebut() {
		return HeureDebut;
	}
	public void setHeureDebut(int heureDebut) {
		HeureDebut = heureDebut;
	}
	public int getHeureFin() {
		return HeureFin;
	}
	public void setHeureFin(int heureFin) {
		HeureFin = heureFin;
	}
	public int getGrainTemporel() {
		return GrainTemporel;
	}
	public void setGrainTemporel(int grainTemporel) {
		GrainTemporel = grainTemporel;
	}
	public Date getDateDebut() {
		return DateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		DateDebut = dateDebut;
	}
	public Date getDatefin() {
		return Datefin;
	}
	public void setDatefin(Date datefin) {
		Datefin = datefin;
	}
	public String getMatiereV2() {
		return MatiereV2;
	}
	public void setMatiereV2(String matiereV2) {
		MatiereV2 = matiereV2;
	}
	public Calendrier getCalendrier() {
		return Calendrier;
	}
	public void setCalendrier(Calendrier calendrier) {
		Calendrier = calendrier;
	}

	
}
