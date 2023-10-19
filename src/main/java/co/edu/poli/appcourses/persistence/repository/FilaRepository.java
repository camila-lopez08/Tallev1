package co.edu.poli.appcourses.persistence.repository;

import co.edu.poli.appcourses.persistence.entity.Fila;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilaRepository extends JpaRepository<Fila, Long> {

}
