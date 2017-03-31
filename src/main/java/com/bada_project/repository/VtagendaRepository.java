package com.bada_project.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bada_project.model.Vtagenda;

public interface VtagendaRepository extends MongoRepository<Vtagenda, String> {

}
