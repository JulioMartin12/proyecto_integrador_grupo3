package org.example.models;

import lombok.*;

import javax.persistence.*;
<<<<<<< HEAD
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
=======
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
>>>>>>> 6cc5d27119da4889822383f4572299140637943a
    private List<Especialidad> especialidades;

    // TODO: El constructor se verá que datos vamos a necesitar.
}
