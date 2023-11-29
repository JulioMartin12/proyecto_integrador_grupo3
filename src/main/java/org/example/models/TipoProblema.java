package org.example.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data @AllArgsConstructor
@Entity
@Table(name = "TIPOS_PROBLEMAS")
public class TipoProblema implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre", nullable = false, length = 45)
    private String nombre;
    @Column(name = "tiempo_maximo_resolucion", nullable = false)
    private int tiempoMaxResolucion;
}
