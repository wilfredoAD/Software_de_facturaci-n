package com.facturacion.software.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.facturacion.software.Iservices.FacturaIServices;
import com.facturacion.software.collection.Facturas;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/facturas")
public class FacturaController {

    @Autowired
    private FacturaIServices services;

    @GetMapping
    public List<Facturas> all() {
        return services.all();
    }

    @GetMapping("{id}")
    public Optional<Facturas> show(@PathVariable String id) {
        return services.findById(id);

    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Facturas save(@RequestBody Facturas factura) {
        return services.save(factura);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Facturas update(@PathVariable String id, @RequestBody Facturas facturas) {
        Optional<Facturas> Op = services.findById(id);

        if (!Op.isEmpty()) {

            Facturas updateFacturas = Op.get();       
            updateFacturas.setDescripcion(facturas.getDescripcion());
            updateFacturas.setCantidad(facturas.getCantidad());
            updateFacturas.setValorUnitario(facturas.getValorUnitario());
            updateFacturas.setIva(facturas.getIva());
            updateFacturas.setTotal(facturas.geTotal());
            updateFacturas.setEstado(facturas.getEstado());        
            return services.save(updateFacturas);

        }
        return facturas;
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        services.delete(id);
    }

}