package com.facturacion.software.collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "usuarios")
public class Usuarios {

    @Id
    private String id;

    @Field("nombres")
    private String Nombres;

    @Field("documento")
    private String documento;

    @Field("email")
    private String email;

    @Field("password")
    private String password;

    @Field("estado")
    private boolean estado;

    @DBRef
    private Roles rolId;

    public Usuarios() {
    }

    public Usuarios(String id, String nombres, String documento, String email, String password, boolean estado,
            Roles rolId) {
        this.id = id;
        Nombres = nombres;
        this.documento = documento;
        this.email = email;
        this.password = password;
        this.estado = estado;
        this.rolId = rolId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Roles getRolId() {
        return rolId;
    }

    public void setRolId(Roles rolId) {
        this.rolId = rolId;
    }

}
