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

import com.facturacion.software.Iservices.ClientesIServices;
import com.facturacion.software.collection.Clientes;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/cliente")
public class ClientesController {

    @Autowired
    private ClientesIServices services;

    @GetMapping
    public List<Clientes> all() {
        return services.all();
    }

    @GetMapping("{id}")
    public Optional<Clientes> show(@PathVariable String id) {
        return services.findById(id);

    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Clientes save(@RequestBody Clientes clientes) {
        return services.save(clientes);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Clientes update(@PathVariable String id, @RequestBody Clientes clientes) {
        Optional<Clientes> Op = services.findById(id);

        if (!Op.isEmpty()) {
            Clientes updateClientes = Op.get();
            updateClientes.setNit(clientes.getNit());
            updateClientes.setNombresCliente(clientes.getNombresCliente());
            updateClientes.setTelefono(clientes.getTelefono());
            updateClientes.setDireccion(clientes.getDireccion());
            updateClientes.setEstado(clientes.getEstado());           
            return services.save(updateClientes);

        }

        return clientes;
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        services.delete(id);
    }
}
