package org.example.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data @AllArgsConstructor
@Entity
@Table(name = "TIPOS_PROBLEMAS")
public class TipoProblema implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre", nullable = false, length = 45)
    private String nombre;
    @Column(name = "tiempo_maximo_resolucion", nullable = false)
    private int tiempoMaxResolucion;
    @Setter(value = AccessLevel.NONE)
    @ManyToMany
    @JoinTable(
            name = "ESPECIALIDADES_TIPOS_PROBLEMAS",
            joinColumns = @JoinColumn(name = "ID_TIPO_PROBLEMA", foreignKey=@ForeignKey(name = "ID_TIPO_PROBLEMA_ESPECIALIDADES_TIPOS_PROBLEMAS")),
            inverseJoinColumns = @JoinColumn(name = "ID_ESPECIALIDAD",foreignKey=@ForeignKey(name = "ID_ESPECIALIDAD_ESPECIALIDADES_TIPOS_PROBLEMAS")))
    private Set<Especialidad> especialidades = new HashSet<>();
}
