package org.example.models;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;


@Data @NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name="PROBLEMAS")
public class Problema implements Serializable {
    @Id @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.PRIVATE)
    private int id;
    @Column(name = "nombre",length = 45, nullable = false)
    private String nombre;
    @Column(name = "descripcion",length = 200)
    private String descripcion;
    @Column(nullable = false)
    private int horas_extra = 0;
    @ManyToOne
    @JoinColumn(name = "id_incidente", foreignKey = @ForeignKey(name = "id_incidente_problemas"))
    @ToString.Exclude
    private Incidente incidente;
    @ManyToOne
    @JoinColumn(name = "id_tipo_problema", nullable = false, foreignKey = @ForeignKey(name = "id_tipo_problema_problemas"))
    private TipoProblema tipoProblema;
    public Problema(String nombre){
        this.nombre = nombre;
    }

    public void setTipoProblema(TipoProblema tipoProblema) {
        if (tipoProblema == null){
            if (this.tipoProblema == null){
                return;
            }
            this.tipoProblema.getProblemas().remove(this);
            this.tipoProblema = null;
            return;
        }
        tipoProblema.getProblemas().add(this);
        this.tipoProblema = tipoProblema;
    }
}
