package com.facturacion.software.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facturacion.software.Iservices.RolesIServices;
import com.facturacion.software.collection.Roles;
import com.facturacion.software.repository.RolesRepository;


@Service
public class RolesServices implements RolesIServices {

    @Autowired
    private RolesRepository repository;

    @Override
    public List<Roles> all() {
        return repository.findAll();
    }

    @Override
    public Optional<Roles> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Roles save(Roles roles) {
        return repository.save(roles);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);

    }

}
