package com.facturacion.software.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.facturacion.software.collection.Facturas;

public interface FacturaRepository extends MongoRepository<Facturas,String> {
    
}
