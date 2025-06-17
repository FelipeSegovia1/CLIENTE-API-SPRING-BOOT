package com.clientes.dto;

import com.clientes.models.Usuario;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {
    private Integer idUsuario;
    private String nombreUsuario;
    private String email;
    private String rol;
    private String estado;
    public UsuarioDTO usuarioToDto(Usuario usuario) {
        return new UsuarioDTO(
            usuario.getIdUsuario(),
            usuario.getNombreUsuario(),
            usuario.getEmail(),
            usuario.getRol(),
            usuario.getEstado()
        );
    }
}
