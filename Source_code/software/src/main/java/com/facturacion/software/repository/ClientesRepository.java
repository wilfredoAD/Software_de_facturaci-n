package com.facturacion.software.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.facturacion.software.collection.Clientes;

public interface ClientesRepository extends MongoRepository<Clientes, String> {
    
}
