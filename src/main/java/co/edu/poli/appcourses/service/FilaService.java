package co.edu.poli.appcourses.service;

import co.edu.poli.appcourses.persistence.entity.Fila;
import java.util.List;

public interface FilaService {
    Fila save(Fila fila);
    List<Fila> findAll();
}
