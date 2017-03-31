package com.bada_project.model;

import org.springframework.data.mongodb.core.mapping.Field;

public class DataVisualTimetabling {
	
	@Field("SAUVEGARDE")
	private Sauvegarde sauvegarde;

	public Sauvegarde getSauvegarde() {
		return sauvegarde;
	}

	public void setSauvegarde(Sauvegarde sauvegarde) {
		this.sauvegarde = sauvegarde;
	}

	
	
	

}
