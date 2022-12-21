package com.facturacion.software.Iservices;

import java.util.List;
import java.util.Optional;

import com.facturacion.software.collection.Usuarios;

public interface UsuariosIServices    {
    
    public List<Usuarios> all();
	
	public Optional<Usuarios> findById(String id);
	
	public Usuarios save(Usuarios usarios);
	
	public void delete(String id);

}
