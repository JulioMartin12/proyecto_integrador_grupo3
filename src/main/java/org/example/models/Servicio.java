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
    @Setter(AccessLevel.NONE)
    Set<Cliente> clientes = new HashSet<>();
    @OneToMany(mappedBy = "servicio")
    @Setter(AccessLevel.NONE)
    private Set<Incidente> incidentes = new HashSet<>();
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
