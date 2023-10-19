
package co.edu.poli.appcourses.persistence.repository;


import co.edu.poli.appcourses.persistence.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}

