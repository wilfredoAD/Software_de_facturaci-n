package com.facturacion.software.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.facturacion.software.collection.Roles;

public interface RolesRepository extends MongoRepository<Roles,String> {
    
}
