package com.bada_project.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public class Vtagenda {
	
	@Id
	private ObjectId id;
	
	@Field("DATA_VISUAL_TIMETABLING")
	private DataVisualTimetabling DATA_VISUAL_TIMETABLING;

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public DataVisualTimetabling getDATA_VISUAL_TIMETABLING() {
		return DATA_VISUAL_TIMETABLING;
	}

	public void setDATA_VISUAL_TIMETABLING(DataVisualTimetabling dATA_VISUAL_TIMETABLING) {
		DATA_VISUAL_TIMETABLING = dATA_VISUAL_TIMETABLING;
	}
	
	

}