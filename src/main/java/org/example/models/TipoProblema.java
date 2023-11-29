package org.example.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor(force = true)
@Setter
@Getter
@ToString
@Entity
@Table(name = "tipos_problemas")
public class TipoProblema implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre", nullable = false, length = 45) @NonNull
    private String nombre;
    @Column(name = "tiempo_maximo_resolucion", nullable = false) @NonNull
    private int tiempoMaxResolucion;

//    public TipoProblema(String nombre, int tiempoMaxResolucion) {
//        this.nombre = nombre;
//        this.tiempoMaxResolucion = tiempoMaxResolucion;
//    }
}
