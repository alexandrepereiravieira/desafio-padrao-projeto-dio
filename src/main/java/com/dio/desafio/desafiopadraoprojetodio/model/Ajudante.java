package com.dio.desafio.desafiopadraoprojetodio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Ajudante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long matricula;

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
