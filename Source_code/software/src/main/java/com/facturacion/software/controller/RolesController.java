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

import com.facturacion.software.Iservices.RolesIServices;
import com.facturacion.software.collection.Roles;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/roles")
public class RolesController {

    @Autowired
    private RolesIServices services;

    @GetMapping
    public List<Roles> all() {
        return services.all();
    }

    @GetMapping("{id}")
    public Optional<Roles> show(@PathVariable String id) {
        return services.findById(id);

    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Roles save(@RequestBody Roles roles) {
        return services.save(roles);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Roles update(@PathVariable String id, @RequestBody Roles roles) {
        Optional<Roles> Op = services.findById(id);

        if (!Op.isEmpty()) {
            Roles updateRoles = Op.get();            
            updateRoles.setNombre(roles.getNombre());
            updateRoles.setEstado(roles.getEstado());                        
            return services.save(updateRoles);
        }

        return roles;
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        services.delete(id);
    }

}
