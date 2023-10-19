package co.edu.poli.appcourses.service;

import co.edu.poli.appcourses.persistence.entity.Perfil;
import java.util.List;

public interface PerfilService {

    Perfil save(Perfil perfil);
    List<Perfil> findAll();
}
