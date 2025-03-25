package com.senai.aula.controller;

import com.senai.aula.model.Usuario;
import com.senai.aula.repository.UsuarioRepository;
import com.senai.aula.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> listarUsuarios(){
        return usuarioService.listarUsuarios();
    }
    @GetMapping("/{id}")
    public Optional<Usuario> buscarUsuario(Long id){
        return usuarioService.buscarUsuario(id);
    }
    @PostMapping
    public Usuario criarUsuarios(Usuario usuario){
        return usuarioService.criarUsuario(usuario);
    }

    @DeleteMapping("/{id}")
    public void deletarUsuarios(Long id){
        usuarioService.deletarUsuario(id);
    }

}
