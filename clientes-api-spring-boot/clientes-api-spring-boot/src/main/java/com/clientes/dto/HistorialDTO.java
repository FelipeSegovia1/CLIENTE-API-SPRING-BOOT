package com.clientes.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class HistorialDTO {

    private Integer idHistorial;

    private LocalDate fecha;
    private Double total;
}
