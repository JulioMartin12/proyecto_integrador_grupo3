package org.example.models;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data @NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "TECNICOS")
public class Tecnico implements Serializable {
    /* TODO El sistema debe dar la posibilidad de informar:
        Quién fue el técnico con más incidentes resueltos en los últimos N días
        Quién fue el técnico con más incidentes resueltos de una determinada
        especialidad en los últimos N días
        Quién fue el técnico que más rápido resolvió los incidentes
     */
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Setter(AccessLevel.PRIVATE)
    private int id;
    @Column(length = 45, nullable = false)
    private String nombre;
    @Column(length = 45, nullable = false)
    private String apellido;
    @ManyToMany
    @JoinTable(
            name = "ESPECIALIDADES_TECNICOS",
            joinColumns = @JoinColumn(name = "id_tecnico", foreignKey=@ForeignKey(name = "id_tecnico_especialidades_tecnicos")),
            inverseJoinColumns = @JoinColumn(name = "id_especialidad",foreignKey=@ForeignKey(name = "id_especialidad_especialidades_tecnicos")))
    @Setter(AccessLevel.NONE)
    private final Set<Especialidad> especialidades = new HashSet<>();
    @OneToMany(mappedBy = "tecnico")
    @Setter(AccessLevel.NONE)
    private Set<TecnicoEstimacion> estimaciones = new HashSet<>();
    @OneToMany(mappedBy = "tecnico")
    @Setter(AccessLevel.NONE)
    private Set<Incidente> incidentes = new HashSet<>();
    public void addEstimacion(TecnicoEstimacion estimacion){
        estimaciones.add(estimacion);
        estimacion.getTipoProblema().getEstimaciones().add(estimacion);
    }
    public void addIncidente(Incidente incidente){
        incidentes.add(incidente);
        incidente.setTecnico(this);
    }
    public void addEspecialidad(Especialidad especialidad){
        especialidades.add(especialidad);
        especialidad.getTecnicos().add(this);
    }
    public void removeEstimacion(TecnicoEstimacion estimacion){
        estimaciones.remove(estimacion);
        estimacion.getTipoProblema().getEstimaciones().remove(estimacion);
        estimacion.setTipoProblema(null);
        estimacion.setTecnico(null);
    }
    public Tecnico(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
