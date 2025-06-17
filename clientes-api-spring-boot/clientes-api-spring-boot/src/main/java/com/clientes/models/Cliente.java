package com.clientes.models;

import java.util.List;
import jakarta.persistence.*;

import lombok.Data;

@Entity
@Table(name = "clientes")
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;

    private Integer idUsuario;

    private String nombreCompleto;

    private String rut;

    private String direccion;

    private String telefono;


    private String tipo; 
    private String categoriaPreferida;
    private String frecuenciaCompra;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Direccion> direcciones;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Historial> historialCompras;

}
