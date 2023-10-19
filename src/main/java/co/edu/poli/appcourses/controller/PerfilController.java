package co.edu.poli.appcourses.controller;

import co.edu.poli.appcourses.exceptions.UsuarioException;
import co.edu.poli.appcourses.persistence.entity.Perfil;

//import co.edu.poli.appcourses.persistence.entity.Usuario;
import co.edu.poli.appcourses.service.PerfilService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/perfiles")
@RequiredArgsConstructor
public class PerfilController {

    private final PerfilService perfilService;

    @PostMapping
    public Perfil save(Perfil perfil) {
        return perfilService.save(perfil);
    }

    @GetMapping
    public List<Perfil> findAll() {
        return perfilService.findAll();
    }



}
