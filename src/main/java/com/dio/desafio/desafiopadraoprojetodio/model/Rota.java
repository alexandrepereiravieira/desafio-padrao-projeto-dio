package com.dio.desafio.desafiopadraoprojetodio.model;

import jakarta.persistence.*;

import java.util.Date;


@Entity
public class Rota {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;

    private Date dataEntrega;
    @ManyToOne
    private Funcionario motorista;
    @ManyToOne
    private Funcionario ajudante1;

    @ManyToOne
    private Funcionario ajudante2;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Funcionario getMotorista() {
        return motorista;
    }

    public void setMotorista(Funcionario motorista) {
        this.motorista = motorista;
    }

    public Funcionario getAjudante1() {
        return ajudante1;
    }

    public void setAjudante1(Funcionario ajudante1) {
        this.ajudante1 = ajudante1;
    }

    public Funcionario getAjudante2() {
        return ajudante2;
    }

    public void setAjudante2(Funcionario ajudante2) {
        this.ajudante2 = ajudante2;
    }
}
