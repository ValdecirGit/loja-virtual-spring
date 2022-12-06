package com.dev.backend.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity //define que a classe é uma entidade
@Table (name="marca") // controla nome da tabela 
@Data // usa lombok para fazer automanticamente as importacao dos geters e seters

public class Marca {

    @Id // identifica como chave primaria no banco de dados
    @GeneratedValue(strategy = GenerationType.AUTO) // geracao de chave primaria automaticamente
    private long id; // identificador dos estados

    
    private String nome;
    
    @Temporal(TemporalType.TIMESTAMP) // atualiza no banco data e hora
    private Date dataCriacao;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAtualizacao; // atualiza no banco data e hora
    
}
