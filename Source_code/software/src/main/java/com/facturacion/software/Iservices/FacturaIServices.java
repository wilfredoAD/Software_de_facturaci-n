package com.facturacion.software.Iservices;

import java.util.List;
import java.util.Optional;

import com.facturacion.software.collection.Facturas;

public interface FacturaIServices {

    public List<Facturas> all();
	
	public Optional<Facturas> findById(String id);
	
	public Facturas save(Facturas factura);
	
	public void delete(String id);
}
