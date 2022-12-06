package com.dev.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.backend.entity.Marca;


// interface sem implementações que vai estender JPARepository
// que nos fornece metodos basicos de inserir,alterar,deletar e consultar
// nesta interface passo a classe de entidade 'Estado' e o indentificador

public interface MarcaRepository extends JpaRepository<Marca, Long> {
    // aqui sera definido consultas personalizadas    
}
