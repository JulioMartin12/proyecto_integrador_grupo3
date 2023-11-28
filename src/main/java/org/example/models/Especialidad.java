package org.example.models;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;


@AllArgsConstructor @RequiredArgsConstructor @NoArgsConstructor(force = true)
@Setter @Getter @ToString
@Entity @Table(name = "especialidades")
public class Especialidad implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NonNull @Column(name = "nombre", length = 45)
    private String nombre;
    private String descripcion;
}
