package com.dio.desafio.desafiopadraoprojetodio.model;

import jakarta.persistence.*;

@Entity
public class Rota {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;
    @OneToMany(fetch = FetchType.EAGER)
    private Motorista motorista;
    private Ajudante ajudante1;

    private Ajudante ajudante2;

}
