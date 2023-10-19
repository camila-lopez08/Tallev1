package co.edu.poli.appcourses.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
import java.util.Objects;
@Entity
@Getter
@Setter
@Table(name = "Usuarios")

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id")
    private Long usuarioId;
    private LocalDateTime fechaNacimiento;
    private int edad;
    private boolean estado;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario usuario)) return false;
        return edad == usuario.edad && estado == usuario.estado && usuarioId.equals(usuario.usuarioId) && fechaNacimiento.equals(usuario.fechaNacimiento);
    }
}

