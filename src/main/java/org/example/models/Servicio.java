package org.example.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data @NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "SERVICIOS")
public class Servicio implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Setter(AccessLevel.PRIVATE)
    private int id;
    @Column(length = 45, nullable = false)
    private String nombre;
    private String descripcion;
    @ManyToMany(mappedBy = "servicios")
    Set<Cliente> clientes = new HashSet<>();
    public Servicio(String nombre){
        this.nombre = nombre;
    }

}
