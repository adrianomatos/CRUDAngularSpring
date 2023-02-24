package com.projeto.apiangular.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.projeto.apiangular.modelo.Cliente;

@Repository
public interface Repositorio extends CrudRepository<Cliente,Long>{
    
}
