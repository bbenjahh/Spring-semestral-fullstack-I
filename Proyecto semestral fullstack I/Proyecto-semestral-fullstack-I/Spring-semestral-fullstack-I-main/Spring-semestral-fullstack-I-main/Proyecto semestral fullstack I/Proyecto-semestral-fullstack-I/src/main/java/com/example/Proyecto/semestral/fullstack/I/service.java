package com.example.Proyecto.semestral.fullstack.I;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> obtenerTodos(){
        return usuarioRepository.findAll();
    }
}
