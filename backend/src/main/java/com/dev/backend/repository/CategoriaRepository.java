package com.dev.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.backend.entity.Categoria;


// interface sem implementações que vai estender JPARepository
// que nos fornece metodos basicos de inserir,alterar,deletar e consultar
// nesta interface passo a classe de entidade 'Categoria' e o indentificador

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    // aqui sera definido consultas personalizadas    
}
