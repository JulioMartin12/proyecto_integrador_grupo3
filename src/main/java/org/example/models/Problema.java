package org.example.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name="PROBLEMAS")
public class Problema implements Serializable {
    @Getter(value = AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre",length = 45, nullable = false)
    private String nombre;
    @Column(name = "descripcion",length = 200, nullable = false)
    private String descripcion;
    @Transient
    private int tiempoSolucion;
    @Transient
    private List<Especialidad> especialidades;

    // TODO: El constructor se verá que datos vamos a necesitar.
}
