package org.example.models;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity @Table(name = "ESTIMACIONES_TECNICOS")
@IdClass(TecnicoEstimacionId.class)
public class TecnicoEstimacion implements Serializable {
    @Id @ManyToOne
    @JoinColumn(name = "id_tecnico", referencedColumnName = "id", foreignKey = @ForeignKey(name = "id_tecnico_estimaciones"))
    private Tecnico tecnico;
    @Id @ManyToOne
    @JoinColumn(name = "id_tipo_problema", referencedColumnName = "id", foreignKey = @ForeignKey(name = "id_tipo_problema_estimaciones"))
    private TipoProblema tipoProblema;
    @Column(name = "horas_estimadas", nullable = false)
    private int horasEstimadas;
}
