package co.edu.poli.appcourses.persistence.repository;

import co.edu.poli.appcourses.persistence.entity.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Long>  {
}
