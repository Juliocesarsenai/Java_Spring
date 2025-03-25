package com.senai.aula.controller;

import com.senai.aula.model.Funcionario;
import com.senai.aula.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping
    public List<Funcionario> listarFuncionarios(){
        return funcionarioService.listarFuncionarios();
    }

    @GetMapping("/{id}")
    public Optional<Funcionario> buscarFuncionarios(Long id){
        return funcionarioService.buscarFuncionarios(id);
    }

    @PostMapping
    public Funcionario criar(@RequestBody Funcionario funcionario){
        return funcionarioService.criarFuncionario(funcionario);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        funcionarioService.deletarFuncionario(id);
    }


}
