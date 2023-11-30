package org.example.models;

import lombok.*;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Data @NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name="INCIDENTES")
public class Incidente  implements Serializable {
    @Id @EqualsAndHashCode.Include
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id_incidente")
    @Setter(AccessLevel.PRIVATE)
    private int id;
    @Enumerated(EnumType.STRING)
    @Column(name ="estado",nullable = false)
    private Estado estado;
    @OneToMany(mappedBy = "incidente")
    private Set<Problema> problemas = new HashSet<>();
    @Column(name = "fechaDeInicio", nullable = false)
    private LocalDateTime fechaDeInicio;
    @Column(name = "fechaResolucion")
    private LocalDateTime fechaResolucion;

    public Incidente(Estado estado, LocalDateTime fechaDeInicio) {
        this.estado = estado;
        this.fechaDeInicio = fechaDeInicio;
    }
}
