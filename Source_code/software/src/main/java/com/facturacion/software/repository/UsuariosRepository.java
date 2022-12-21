package com.facturacion.software.repository;

//import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.Query;

import com.facturacion.software.collection.Usuarios;

public interface UsuariosRepository extends MongoRepository<Usuarios,String> {
	// @Query("{nombre:?0, email:?1}")
	// List<Usuarios> findByNombreAndEmail(String username, String email);
    // Usuarios findByUsername(String username);
}
