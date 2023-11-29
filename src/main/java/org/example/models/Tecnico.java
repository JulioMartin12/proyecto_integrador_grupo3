package org.example.models;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
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
    @Getter(value = AccessLevel.NONE)
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Transient
    private int incidentesResueltos;
    @Column(length = 45, nullable = false)
    private String nombre;
    @Column(length = 45, nullable = false)
    private String apellido;
    @Transient
    private List<Especialidad> especialidades;

    // TODO: El constructor se verá que datos vamos a necesitar.
}
