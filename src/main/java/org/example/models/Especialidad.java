package org.example.models;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;


@Data @AllArgsConstructor @NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity @Table(name = "ESPECIALIDADES")
public class Especialidad implements Serializable {
    @EqualsAndHashCode.Include
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre", length = 45, nullable = false)
    private String nombre;
    @Column(name = "descripcion",length = 200)
    private String descripcion;
    public Especialidad(String nombre){
        this.nombre = nombre;
    }
}
