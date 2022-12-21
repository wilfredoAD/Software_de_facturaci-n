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

import com.facturacion.software.Iservices.UsuariosIServices;
import com.facturacion.software.collection.Usuarios;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/usuarios")
public class UsuariosController {

  @Autowired
  private UsuariosIServices services;

  @GetMapping
  public List<Usuarios> all() {
    return services.all();
  }

  @GetMapping("{id}")
  public Optional<Usuarios> show(@PathVariable String id) {
    return services.findById(id);

  }

  @PostMapping
  @ResponseStatus(code = HttpStatus.CREATED)
  public Usuarios save(@RequestBody Usuarios usuarios) {
    return services.save(usuarios);
  }

  @PutMapping("{id}")
  @ResponseStatus(code = HttpStatus.CREATED)
  public Usuarios update(@PathVariable String id, @RequestBody Usuarios usuarios) {
    Optional<Usuarios> Op = services.findById(id);

    if (!Op.isEmpty()) {
      Usuarios updateUser = Op.get();
      updateUser.setNombres(usuarios.getNombres());
      updateUser.setDocumento(usuarios.getDocumento());
      updateUser.setEmail(usuarios.getEmail());
      updateUser.setPassword(usuarios.getPassword());
      updateUser.setEstado(usuarios.getEstado());
      return services.save(updateUser);
    }

    return usuarios;
  }

  @DeleteMapping("{id}")
  @ResponseStatus(code = HttpStatus.NO_CONTENT)
  public void delete(@PathVariable String id) {
    services.delete(id);
  }

}
