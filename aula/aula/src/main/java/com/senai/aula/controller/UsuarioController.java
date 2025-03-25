package com.senai.aula.controller;

import com.senai.aula.model.Usuario;
import com.senai.aula.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public List<Usuario> listarUsuarios(){
        return usuarioRepository.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Usuario> buscarUsuario(Long id){
        return usuarioRepository.findById(id);
    }
    @PostMapping
    public Usuario criar(@RequestBody Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        usuarioRepository.deleteById(id);
    }

}
