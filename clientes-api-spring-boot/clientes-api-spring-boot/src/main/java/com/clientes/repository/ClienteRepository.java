package com.clientes.repository;

import java.util.List;
import com.clientes.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    @Query("SELECT c FROM Cliente c WHERE c.categoriaPreferida IS NOT NULL OR c.frecuenciaCompra IS NOT NULL")
    List<Cliente> findConPreferencias();
}