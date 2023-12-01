package org.example.models;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Data @NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity @Table(name = "ESPECIALIDADES")
public class Especialidad implements Serializable {
    @EqualsAndHashCode.Include
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.PRIVATE)
    private int id;
    @Column(name = "nombre", length = 45, nullable = false)
    private String nombre;
    @Column(name = "descripcion",length = 200)
    private String descripcion;
    @ManyToMany(mappedBy = "especialidades")
    @Setter(AccessLevel.NONE)
    Set<Tecnico> tecnicos = new HashSet<>();
    @ManyToMany(mappedBy = "especialidades")
    @Setter(AccessLevel.NONE)
    Set<TipoProblema> tiposProblemas = new HashSet<>();
    public void addTipoProblema(TipoProblema tipoProblema){
        tiposProblemas.add(tipoProblema);
        tipoProblema.getEspecialidades().add(this);
    }
    public Especialidad(String nombre){
        this.nombre = nombre;
    }
}
