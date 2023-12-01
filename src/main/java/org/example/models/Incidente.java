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
    private Estado estado = Estado.SINREVISAR;
    @OneToMany(mappedBy = "incidente")
    @Setter(AccessLevel.NONE)
    private Set<Problema> problemas = new HashSet<>();
    @ManyToOne
    @JoinColumn(name = "id_tecnico", nullable = false, foreignKey = @ForeignKey(name = "id_tecnico_incidentes"))
    private Tecnico tecnico;
    @ManyToOne
    @JoinColumn(name = "id_servicio", nullable = false, foreignKey = @ForeignKey(name = "id_servicio_incidentes"))
    private Servicio servicio;
    @ManyToOne
    @JoinColumn(name = "cuit_cliente", nullable = false, foreignKey = @ForeignKey(name = "cuit_cliente_incidentes"))
    private Cliente cliente;
    @Column(name = "fechaDeInicio", nullable = false)
    private LocalDateTime fechaDeInicio = LocalDateTime.now();
    @Column(name = "fechaResolucion")
    private LocalDateTime fechaResolucion;

    public Incidente(Estado estado, LocalDateTime fechaDeInicio) {
        this.estado = estado;
        this.fechaDeInicio = fechaDeInicio;
    }
    public void addProblema(Problema problema){
        problemas.add(problema);
        problema.setIncidente(this);
    }
}
