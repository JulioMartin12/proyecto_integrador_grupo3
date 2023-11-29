package org.example.models;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;


@AllArgsConstructor @RequiredArgsConstructor @NoArgsConstructor(force = true)
@Setter @Getter @ToString
@Entity @Table(name = "ESPECIALIDADES")
public class Especialidad implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NonNull @Column(name = "nombre", length = 45)
    private String nombre;
    @Column(name = "descripcion",length = 200,nullable = false)
    private String descripcion;
}
