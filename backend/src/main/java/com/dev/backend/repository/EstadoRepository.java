package com.dev.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.backend.entity.Estado;


// interface sem implementações que vai estender JPARepository
// que nos fornece metodos basicos de inserir,alterar,deletar e consultar
// nesta interface passo a classe de entidade 'Estado' e o indentificador

public interface EstadoRepository extends JpaRepository<Estado, Long> {
    // aqui sera definido consultas personalizadas    
}
