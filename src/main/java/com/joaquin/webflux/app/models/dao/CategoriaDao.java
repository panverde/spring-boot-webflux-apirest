package com.joaquin.webflux.app.models.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.joaquin.webflux.app.models.documents.Categoria;

public interface CategoriaDao extends ReactiveMongoRepository<Categoria, String>{

}
