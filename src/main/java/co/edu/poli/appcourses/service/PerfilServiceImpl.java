package co.edu.poli.appcourses.service;

import co.edu.poli.appcourses.persistence.entity.Perfil;
import co.edu.poli.appcourses.persistence.repository.PerfilRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class PerfilServiceImpl implements PerfilService {

    private final PerfilRepository perfilRepository;


    @Override
    public Perfil save(Perfil perfil) {
        return perfilRepository.save(perfil);
    }

    @Override
    public List<Perfil> findAll() {
        return perfilRepository.findAll();
    }

}
