package co.edu.poli.appcourses.controller;

import co.edu.poli.appcourses.persistence.entity.Fila;
import co.edu.poli.appcourses.service.FilaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filas")
@RequiredArgsConstructor

public class FilaController {
    private final FilaService filaService;

    @PostMapping
    public Fila save(Fila fila) {
        return filaService.save(fila);
    }

    @GetMapping
    public List<Fila> findAll() {
        return filaService.findAll();
    }
}
