package com.clientes.config;


import org.springframework.stereotype.Component;

import com.clientes.dto.UsuarioDTO;
import com.clientes.models.Usuario;


@Component
public class UsuarioMapper {
    public UsuarioDTO usuarioToDto(Usuario usuario) {
        UsuarioDTO dto = new UsuarioDTO();
        dto.setIdUsuario(usuario.getIdUsuario());
        dto.setNombreUsuario(usuario.getNombreUsuario());
        dto.setEmail(usuario.getEmail());
        dto.setRol(usuario.getRol());
        dto.setEstado(usuario.getEstado());
        return dto;
    }
}