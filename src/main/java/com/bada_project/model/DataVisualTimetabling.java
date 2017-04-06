package com.bada_project.model;

import org.springframework.data.mongodb.core.mapping.Field;

public class DataVisualTimetabling {
	
	@Field("SAUVEGARDE")
	private Sauvegarde sauvegarde;
	
	@Field("LES_SEANCES")
	private LesSeances lesSeances;

	public Sauvegarde getSauvegarde() {
		return sauvegarde;
	}

	public void setSauvegarde(Sauvegarde sauvegarde) {
		this.sauvegarde = sauvegarde;
	}

	
	
	

}
