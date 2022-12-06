package com.dev.backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.backend.entity.Estado;
import com.dev.backend.entity.Marca;
import com.dev.backend.repository.EstadoRepository;
import com.dev.backend.repository.MarcaRepository;

@Service // anotacao do Spring dizendo que a classe é um service 

public class MarcaService {
    
    //objeto 
    @Autowired // Spring controla todas as dependencias desse objeto
        private MarcaRepository marcaRepository;

    //Metodos

    public List<Marca> buscarTodos(){
        return marcaRepository.findAll(); // JPARepository fornece esta função do findAll
    }

    public Marca inserir(Marca marca) {
        marca.setDataCriacao(new Date());
        Marca marcaNova = marcaRepository.saveAndFlush(marca);
        return marcaNova;
    }

    public Marca alterar(Marca marca) {
        marca.setDataAtualizacao(new Date());
        return marcaRepository.saveAndFlush(marca);
    }

    public void excluir(Long id) {
        Marca marca = marcaRepository.findById(id).get();
        marcaRepository.delete(marca);    
    }
}
