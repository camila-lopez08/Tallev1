package co.edu.poli.appcourses.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = "Filas")

public class Fila {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fila_id")
    private Long filaId;
    private int duracion;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fila fila)) return false;

        return Objects.equals(filaId, fila.filaId);
    }

    @Override
    public int hashCode() {
        return filaId != null ? filaId.hashCode() : 0;
    }
}
