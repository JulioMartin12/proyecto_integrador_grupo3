package org.example.models;
import lombok.*;
import javax.persistence.*;


@AllArgsConstructor @RequiredArgsConstructor @NoArgsConstructor(force = true)
@Setter @Getter @ToString
@Entity @Table(name = "especialidades")
public class Especialidad {
    @Id
    private int id;
    @NonNull @Column(name = "nombre", length = 45)
    private String nombre;
    private String descripcion;
}
