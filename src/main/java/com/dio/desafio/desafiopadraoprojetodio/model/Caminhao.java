package com.dio.desafio.desafiopadraoprojetodio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Caminhao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;

    private String placa;

    public Long getID() {
        return ID;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
