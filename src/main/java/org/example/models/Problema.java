package org.example.models;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;


@Data @NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name="PROBLEMAS")
public class Problema implements Serializable {
    @Id @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.PRIVATE)
    private int id;
    @Column(name = "nombre",length = 45, nullable = false)
    private String nombre;
    @Column(name = "descripcion",length = 200)
    private String descripcion;
    @ManyToOne
    @JoinColumn(name = "incidente_id", nullable = false, foreignKey = @ForeignKey(name = "id_incidente_problemas"))
    private Incidente incidente;
    public Problema(String nombre){
        this.nombre = nombre;
    }
}
