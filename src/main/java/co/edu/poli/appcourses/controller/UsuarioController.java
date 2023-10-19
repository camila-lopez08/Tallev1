package co.edu.poli.appcourses.controller;

import co.edu.poli.appcourses.persistence.entity.Usuario;
import co.edu.poli.appcourses.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor

public class UsuarioController {
    private final UsuarioService usuarioService;

    @PostMapping
    public Usuario save(Usuario usuario) {
        return usuarioService.save(usuario);
    }

    @GetMapping
    public List<Usuario> findAll() {
        return usuarioService.findAll();
    }
}