package com.dio.desafio.desafiopadraoprojetodio.service.exception;

public class EntityNotFoundException extends RuntimeException{
    public EntityNotFoundException(String msg){
        super(msg);
    }
}
