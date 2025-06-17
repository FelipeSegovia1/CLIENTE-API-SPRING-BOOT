package com.clientes.dto;

import lombok.Data;

@Data
public class CrearUsuarioRequest {

    private Integer idUsuario;
    private String nombreUsuario;
    private String email;
    private String rol;
    private String estado;
    public String getContrasena() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getContrasena'");
    }
    public String getNombreCompleto() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNombreCompleto'");
    }
    public String getDireccion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDireccion'");
    }
    public String getTelefono() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTelefono'");
    }


}
