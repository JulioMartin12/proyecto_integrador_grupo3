package org.example.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data @NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "TIPOS_PROBLEMAS")
public class TipoProblema implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Setter(AccessLevel.PRIVATE)
    private int id;
    @Column(name = "nombre", nullable = false, length = 45, unique = true)
    private String nombre;
    @Column(name = "tiempo_maximo_resolucion", nullable = false)
    private int tiempoMaxResolucion;
    @ManyToMany
    @JoinTable(
            name = "ESPECIALIDADES_TIPOS_PROBLEMAS",
            joinColumns = @JoinColumn(name = "id_tipo_problema", foreignKey=@ForeignKey(name = "id_tipo_problema_especialidades_tipos_problemas")),
            inverseJoinColumns = @JoinColumn(name = "id_especialidad",foreignKey=@ForeignKey(name = "id_especialidad_especialidades_tipos_problemas")))
    @Setter(AccessLevel.NONE)
    private Set<Especialidad> especialidades = new HashSet<>();
    @OneToMany(mappedBy = "tipoProblema")
    @Setter(AccessLevel.NONE)
    @ToString.Exclude
    private Set<TecnicoEstimacion> estimaciones = new HashSet<>();
    @OneToMany(mappedBy = "tipoProblema")
    @Setter(AccessLevel.NONE)
    @ToString.Exclude
    private Set<Problema> problemas = new HashSet<>();
    public void addEspecialidad(Especialidad especialidad){
        especialidades.add(especialidad);
        especialidad.getTiposProblemas().add(this);
    }
    public void addEstimacion(TecnicoEstimacion estimacion){
        estimacion.getTecnico().addEstimacion(estimacion);
    }
    public void removeEstimacion(TecnicoEstimacion estimacion){
        estimacion.getTecnico().removeEstimacion(estimacion);
    }

}
