package com.clientes.dto;
import java.util.List;
import lombok.Data;

@Data
public class ClienteDTO {
    private Integer idCliente;
    private Integer idUsuario;
    private String nombreCompleto;
    private String rut;
    private String direccion;
    private String telefono;


    private String categoriaPreferida;
    private String frecuenciaCompra;

    private List<DireccionDTO> direcciones;
    private List<HistorialDTO> historialCompras;
}