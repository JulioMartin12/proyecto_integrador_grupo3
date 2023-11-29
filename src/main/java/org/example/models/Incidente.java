package org.example.models;

import com.sun.xml.bind.v2.TODO;
import lombok.*;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
@Data
@Entity
@Table(name="INCIDENTES")
public class Incidente  implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id_incidente")
    @Setter(value = AccessLevel.NONE)
    private int id;
    @Column(name ="estado",nullable = false)
    private Estado estado;
    /*@Column(name = "problema")
    private Problema problema;*/
    @Column(name = "fechaDeInicio", nullable = false)
    private LocalDateTime fechaDeInicio;
    @Column(name = "fechaResolucion")
    private LocalDateTime fechaResolucion;

    public Incidente(Estado estado, LocalDateTime fechaDeInicio) {
        this.estado = estado;
        this.fechaDeInicio = fechaDeInicio;
    }

    // TODO: El constructor se verá que datos vamos a necesitar.
}
