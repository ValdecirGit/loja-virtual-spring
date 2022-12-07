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

import com.dev.backend.entity.Categoria;
import com.dev.backend.service.CategoriaService;

@RestController // responde requisicoes do tipo rest
@RequestMapping("/api/categoria") // rota padrao para todos os endpoints
public class CategoriaController {
    
    @Autowired // para o Spring fazer o gerenciamento automatico de todas as regras de negocio do service
    private CategoriaService categoriaService;

    @GetMapping("/") // notacao para buscar dados 
    public List<Categoria> buscarTodos() {
        return categoriaService.buscarTodos(); // retorno direto pq o metodo tbm retorna uma lista
    }
    
    @PostMapping("/") // notacao para inserir dados
    public Categoria inserir(@RequestBody Categoria categoria) {
        return categoriaService.inserir(categoria);
    }

    @PutMapping("/") 
    public Categoria alterar(@RequestBody Categoria categoria) {
        return categoriaService.alterar(categoria);
    }

    @DeleteMapping("/{id}") 
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id) {
        categoriaService.excluir(id);
        return ResponseEntity.ok().build();
    }
    
}
