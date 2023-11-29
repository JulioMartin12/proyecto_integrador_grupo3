package org.example.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "PROBLEMAS")
public class Problema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_problema")
    @Setter(value = AccessLevel.NONE)
    private int id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "tiempoSolucion")
    private int tiempoSolucion;

@Transient
    private List<Especialidad> especialidades;

    // TODO: El constructor se verá que datos vamos a necesitar.
}
