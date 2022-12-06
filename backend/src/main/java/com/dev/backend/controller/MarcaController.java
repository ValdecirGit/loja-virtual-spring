package com.dev.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.backend.entity.Marca;
import com.dev.backend.service.MarcaService;

@RestController // responde requisicoes do tipo rest
@RequestMapping("/api/marca") // rota padrao para todos os endpoints
public class MarcaController {
    
    @Autowired // para o Spring fazer o gerenciamento automatico de todas as regras de negocio do service
    private MarcaService marcaService;

    @GetMapping("/") // notacao para buscar dados 
    public List<Marca> buscarTodos() {
        return marcaService.buscarTodos(); // retorno direto pq o metodo tbm retorna uma lista
    }
    
    @PostMapping("/") // notacao para inserir dados
    public Marca inserir(@RequestBody Marca marca) {
        return marcaService.inserir(marca);
    }

    @PutMapping("/") 
    public Marca alterar(@RequestBody Marca marca) {
        return marcaService.alterar(marca);
    }

    @DeleteMapping("/{id}") 
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id) {
        marcaService.excluir(id);
        return ResponseEntity.ok().build();
    }
    
}
