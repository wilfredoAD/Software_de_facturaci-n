package com.facturacion.software.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facturacion.software.Iservices.UsuariosIServices;
import com.facturacion.software.collection.Usuarios;
import com.facturacion.software.repository.UsuariosRepository;

@Service
public class UsuariosServices implements UsuariosIServices {

    @Autowired
    private UsuariosRepository repository;

    @Override
    public List<Usuarios> all() {
        return repository.findAll();
    }

    @Override
    public Optional<Usuarios> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Usuarios save(Usuarios usuarios) {
        return repository.save(usuarios);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);

    }

}
