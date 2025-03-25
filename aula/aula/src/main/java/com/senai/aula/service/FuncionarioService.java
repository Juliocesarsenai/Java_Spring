package com.senai.aula.service;

import com.senai.aula.model.Funcionario;
import com.senai.aula.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    private final FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }


    public List<Funcionario> listarFuncionarios(){
        return funcionarioRepository.findAll();
    }


    public Optional<Funcionario> buscarFuncionarios(Long id){
        return funcionarioRepository.findById(id);
    }


    public Funcionario criarFuncionario(@RequestBody Funcionario funcionario){
        return funcionarioRepository.save(funcionario);
    }

    public void deletarFuncionario(@PathVariable Long id){
        funcionarioRepository.deleteById(id);
    }



}
