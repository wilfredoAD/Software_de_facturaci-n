package com.facturacion.software.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facturacion.software.Iservices.FacturaIServices;
import com.facturacion.software.collection.Facturas;
import com.facturacion.software.repository.FacturaRepository;

@Service
public class FacturaServices implements FacturaIServices {
    @Autowired
    private FacturaRepository repository;

    @Override
    public List<Facturas> all() {
        return repository.findAll();
    }

    @Override
    public Optional<Facturas> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Facturas save(Facturas factura) {
        return repository.save(factura);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);

    }

}
