package com.bada_project.model;

import java.util.ArrayList;

import org.springframework.data.mongodb.core.mapping.Field;

public class LesSeances {
	
	@Field("UNE_SEANCE")
	private ArrayList<Seance> LesSeances;

	public ArrayList<Seance> getLesSeance() {
		return LesSeances;
	}

	public void setUneSeances(ArrayList<Seance> uneSeance) {
		this.LesSeances = uneSeance;
	}
}
