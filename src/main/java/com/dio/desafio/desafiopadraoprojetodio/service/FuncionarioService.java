package com.dio.desafio.desafiopadraoprojetodio.service;

import com.dio.desafio.desafiopadraoprojetodio.model.Funcionario;
import com.dio.desafio.desafiopadraoprojetodio.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public Funcionario buscarPorId(Long id){
        return funcionarioRepository.findById(id).get();
    }

    public Iterable<Funcionario> buscarTodos(){
        return funcionarioRepository.findAll();
    }

    public void inserir(Funcionario funcionario){
        funcionarioRepository.save(funcionario);
    }
    public void atualizar (Long id, Funcionario funcionario){
        Optional<Funcionario> funcionarioOpitional = funcionarioRepository.findById(id);
        if (funcionarioOpitional.isPresent()){
            funcionarioRepository.save(funcionario);
        }
    }

    public void removerById(Long id) {
        funcionarioRepository.deleteById(id);
    }
}
