package com.dio.desafio.desafiopadraoprojetodio.service;

import com.dio.desafio.desafiopadraoprojetodio.model.Funcionario;
import com.dio.desafio.desafiopadraoprojetodio.repository.FuncionarioRepository;
import com.dio.desafio.desafiopadraoprojetodio.service.exception.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public Funcionario buscarPorId(Long id){

        return funcionarioRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Id not found " + id));
    }

    public Iterable<Funcionario> buscarTodos(){
        return funcionarioRepository.findAll();
    }

    public void inserir(Funcionario funcionario){
        funcionarioRepository.save(funcionario);
    }
    public void atualizar (Funcionario funcionario){
        Optional<Funcionario> funcionarioOpitional = Optional.ofNullable(funcionarioRepository.findById(funcionario.getMatricula()).orElseThrow(
                () -> new EntityNotFoundException("Id not found " + funcionario.getMatricula())));
        if (funcionarioOpitional.isPresent()){
            funcionarioRepository.save(funcionario);
        }
    }

    public void removerById(Long id) {
        funcionarioRepository.deleteById(id);
    }
}
