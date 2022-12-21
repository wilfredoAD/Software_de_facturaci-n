package com.facturacion.software.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facturacion.software.Iservices.ClientesIServices;
import com.facturacion.software.collection.Clientes;
import com.facturacion.software.repository.ClientesRepository;

@Service
public class ClientesServices implements ClientesIServices {

    @Autowired
    private ClientesRepository repository;

    @Override
    public List<Clientes> all() {
        return repository.findAll();
    }

    @Override
    public Optional<Clientes> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Clientes save(Clientes clientes) {
        return repository.save(clientes);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

}
