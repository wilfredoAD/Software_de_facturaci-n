package com.facturacion.software.collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Clientes")
public class Clientes {

    @Id
    private String id;

    @Field("nit")
    private String nit;

    @Field("nombresCliente")
    private String nombresCliente;

    @Field("telefono")
    private String telefono;

    @Field("direccion")
    private String direccion;

    @Field("estado")
    private boolean estado;

    @DBRef
    private Facturas facturaId;

    public Clientes() {
    }

    public Clientes(String id, String nit, String nombresCliente, String telefono, String direccion, boolean estado,
            Facturas facturaId) {
        this.id = id;
        this.nit = nit;
        this.nombresCliente = nombresCliente;
        this.telefono = telefono;
        this.direccion = direccion;
        this.estado = estado;
        this.facturaId = facturaId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombresCliente() {
        return nombresCliente;
    }

    public void setNombresCliente(String nombresCliente) {
        this.nombresCliente = nombresCliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Facturas getFacturaId() {
        return facturaId;
    }

    public void setFacturaId(Facturas facturaId) {
        this.facturaId = facturaId;
    }

}
