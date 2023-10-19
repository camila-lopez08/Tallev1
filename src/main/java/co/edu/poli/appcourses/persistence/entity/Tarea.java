package co.edu.poli.appcourses.persistence.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = "tareas")
public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tarea_Id")
    private Long tareaId;
    private String nombre;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarea tarea)) return false;

        return Objects.equals(tareaId, tarea.tareaId);
    }

    @Override
    public int hashCode() {
        return tareaId != null ? tareaId.hashCode() : 0;
    }
}
