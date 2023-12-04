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

    @Column(name= "nombre",length = 100, nullable = false)
    private String nombre;

    @Column(name= "descripcion",length = 345, nullable = false)
    private String descripcion;

    @ManyToMany(mappedBy = "servicios")
    @Setter(AccessLevel.NONE)
    private Set<Cliente> clientes = new HashSet<>();

    @OneToMany(mappedBy = "servicio")
    @Setter(AccessLevel.NONE)
    @ToString.Exclude
    private Set<Incidente> incidentes = new HashSet<>();

    public Servicio(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void addCliente(Cliente cliente){
        cliente.addServicio(this);
    }
    public void addIncidente(Incidente incidente){
        incidentes.add(incidente);
        incidente.setServicio(this);
    }
    public void removeCliente(Cliente cliente){
        cliente.removeServicio(this);
    }
    public void removeIncidente(Incidente incidente){
        incidentes.remove(incidente);
        incidente.setServicio(null);
    }
    public Servicio(String nombre){
        this.nombre = nombre;
    }

}
