package com.facturacion.software.Iservices;

import java.util.List;
import java.util.Optional;

import com.facturacion.software.collection.Roles;

public interface RolesIServices {
    
    public List<Roles> all();
	
	public Optional<Roles> findById(String id);
	
	public Roles save(Roles roles);
	
	public void delete(String id);
}
