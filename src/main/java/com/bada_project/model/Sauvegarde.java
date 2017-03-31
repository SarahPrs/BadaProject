package com.bada_project.model;

import org.springframework.data.mongodb.core.mapping.Field;

public class Sauvegarde {
	
	@Field("DATE")
	private String date;
	@Field("VERSION")
	private String version;
	@Field("UTILISATEUR")
	private String utilisateur;
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(String utilisateur) {
		this.utilisateur = utilisateur;
	}
	
}
