package com.dev.backend.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.backend.entity.Estado;
import com.dev.backend.service.EstadoService;

@RestController // responde requisicoes do tipo rest
@RequestMapping("/api/estado") // rota padrao para todos os endpoints
public class EstadoController {
    
    @Autowired // para o Spring fazer o gerenciamento automatico de todas as regras de negocio do service
    private EstadoService estadoService;

    @GetMapping("/") // notacao para buscar dados 
    public List<Estado> buscarTodos() {
        return estadoService.buscarTodos(); // retorno direto pq o metodo tbm retorna uma lista
    }
    
    @PostMapping("/") // notacao para inserir dados
    public Estado inserir(@RequestBody Estado estado) {
        return estadoService.inserir(estado);
    }

    @PutMapping("/") 
    public Estado alterar(@RequestBody Estado estado) {
        return estadoService.alterar(estado);
    }

    @DeleteMapping("/{id}") 
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id) {
        estadoService.excluir(id);
        return ResponseEntity.ok().build();
    }
    
}
