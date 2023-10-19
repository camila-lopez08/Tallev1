package co.edu.poli.appcourses.persistence.repository;


import co.edu.poli.appcourses.persistence.entity.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TareaRepository extends JpaRepository<Tarea, Long> {
}
