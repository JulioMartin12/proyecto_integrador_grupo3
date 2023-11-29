package org.example.models;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "TECNICOS")
public class Tecnico implements Serializable {
    /* TODO El sistema debe dar la posibilidad de informar:
        Quién fue el técnico con más incidentes resueltos en los últimos N días
        Quién fue el técnico con más incidentes resueltos de una determinada
        especialidad en los últimos N días
        Quién fue el técnico que más rápido resolvió los incidentes
     */
    @Setter(value = AccessLevel.NONE)
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Transient
    private int incidentesResueltos;
    @Column(length = 45, nullable = false)
    private String nombre;
    @Column(length = 45, nullable = false)
    private String apellido;
    @ManyToMany
    @JoinTable(
            name = "ESPECIALIDADES_TECNICOS",
            joinColumns = @JoinColumn(name = "ID_TECNICO", foreignKey=@ForeignKey(name = "ID_TECNICO_ESPECIALIDADES_TECNICOS")),
            inverseJoinColumns = @JoinColumn(name = "ID_ESPECIALIDAD",foreignKey=@ForeignKey(name = "ID_ESPECIALIDAD_ESPECIALIDADES_TECNICOS")))
    private Set<Especialidad> especialidades = new HashSet<>();
    // TODO: DECIDIR COMO MAPEAR LAS ESTIMACIONES DE TIEMPO POR TIPO DE PROBLEMA
    // private TIPO_A_DECIDIR estimaciones = new TIPO_A_DECIDIR;
    public Tecnico(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // TODO: El constructor se verá que datos vamos a necesitar.
}
