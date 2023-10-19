package co.edu.poli.appcourses.service;


import co.edu.poli.appcourses.persistence.entity.Fila;
import co.edu.poli.appcourses.persistence.repository.FilaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FilaServiceImpl implements FilaService {

    private final FilaRepository filaRepository;

    @Override
    public Fila save(Fila fila) {
        return filaRepository.save(fila);
    }

    @Override
    public List<Fila> findAll() {
        return filaRepository.findAll();
    }

}
