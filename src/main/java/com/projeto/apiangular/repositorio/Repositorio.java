package com.projeto.apiangular.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.projeto.apiangular.modelo.Cliente;

public interface Repositorio extends CrudRepository<Cliente, Long> {
    
    // long countByCodigo(long codigo);

}
