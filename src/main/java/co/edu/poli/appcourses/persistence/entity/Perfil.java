package co.edu.poli.appcourses.persistence.entity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = "perfiles")
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "perfil_Id")
    private Long perfilId;
    private String name;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Perfil perfil)) return false;

        return Objects.equals(perfilId, perfil.perfilId);
    }

    @Override
    public int hashCode() {
        return perfilId != null ? perfilId.hashCode() : 0;
    }
}
