package com.facturacion.software.Iservices;

import java.util.List;
import java.util.Optional;

import com.facturacion.software.collection.Clientes;

public interface ClientesIServices {

    public List<Clientes> all();

    public Optional<Clientes> findById(String id);

    public Clientes save(Clientes Clientes);

    public void delete(String id);
}
