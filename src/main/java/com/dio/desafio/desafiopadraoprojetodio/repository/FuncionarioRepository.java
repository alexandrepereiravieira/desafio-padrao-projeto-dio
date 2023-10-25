package com.dio.desafio.desafiopadraoprojetodio.repository;

import com.dio.desafio.desafiopadraoprojetodio.model.Funcionario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends CrudRepository<Funcionario, Long> {
}
