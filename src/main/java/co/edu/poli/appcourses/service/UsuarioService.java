package co.edu.poli.appcourses.service;

import co.edu.poli.appcourses.persistence.entity.Usuario;

import java.util.List;

public interface UsuarioService {
    Usuario save(Usuario usuario);
    List<Usuario> findAll();
}