package com.bada_project.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bada_project.model.Seance;

public interface SeanceRepository extends MongoRepository<Seance, String> {
	
	public Seance findByDate(String date);

}
