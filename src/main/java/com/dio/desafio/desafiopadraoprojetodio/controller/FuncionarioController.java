package com.dio.desafio.desafiopadraoprojetodio.controller;

import com.dio.desafio.desafiopadraoprojetodio.model.Funcionario;
import com.dio.desafio.desafiopadraoprojetodio.repository.FuncionarioRepository;
import com.dio.desafio.desafiopadraoprojetodio.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class FuncionarioController {
    @Autowired
    private FuncionarioService funcionarioService;

    private FuncionarioRepository funcionarioRepository;

    @PostMapping
    public ResponseEntity<Funcionario> inserirFuncionario(@RequestBody Funcionario funcionario){
        funcionarioService.inserir(funcionario);
        return ResponseEntity.ok(funcionario);
    }
    @GetMapping
    public ResponseEntity<Iterable<Funcionario>> buscarTodos(){
        return ResponseEntity.ok(funcionarioService.buscarTodos());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Funcionario> buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok(funcionarioService.buscarPorId(id));
    }
    @PutMapping
    public ResponseEntity<Funcionario> atualizar(@PathVariable Long id, @RequestBody Funcionario funcionario){
        if(funcionarioRepository.existsById(id)) {
            funcionarioService.atualizar(id, funcionario);
            return ResponseEntity.ok(funcionario);
        }
        return (ResponseEntity<Funcionario>) ResponseEntity.notFound();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Funcionario> deletar (@PathVariable Long id){
        funcionarioService.removerById(id);
        return ResponseEntity.ok().build();
    }
}
