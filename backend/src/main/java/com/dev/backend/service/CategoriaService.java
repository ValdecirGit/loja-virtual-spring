package com.dev.backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.backend.entity.Categoria;
import com.dev.backend.repository.CategoriaRepository;

@Service // anotacao do Spring dizendo que a classe é um service 

public class CategoriaService {
    
    //objeto 
    @Autowired // Spring controla todas as dependencias desse objeto
        private CategoriaRepository categoriaRepository;

    //Metodos

    public List<Categoria> buscarTodos(){
        return categoriaRepository.findAll(); // JPARepository fornece esta função do findAll
    }

    public Categoria inserir(Categoria categoria) {
        categoria.setDataCriacao(new Date());
        Categoria categoriaNova = categoriaRepository.saveAndFlush(categoria);
        return categoriaNova;
    }

    public Categoria alterar(Categoria categoria) {
        categoria.setDataAtualizacao(new Date());
        return categoriaRepository.saveAndFlush(categoria);
    }

    public void excluir(Long id) {
        Categoria categoria = categoriaRepository.findById(id).get();
        categoriaRepository.delete(categoria);    
    }
}
