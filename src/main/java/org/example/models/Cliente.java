package org.example.models;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Data @NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity @Table(name = "CLIENTES")
public class Cliente implements Serializable {
    @Id @EqualsAndHashCode.Include
    @Column(name = "cuit", length = 11)
    private String cuit;
    @Column(name = "razon_social", nullable = false, length = 45)
    private String razonSocial;
    @Column(name = "email", length = 320) // una direccion email puede llegar a tener 320 caracteres
    private String email;
    @ManyToMany
    @JoinTable(
            name = "SERVICIOS_CLIENTES",
            joinColumns = @JoinColumn(name = "cuit_cliente", foreignKey=@ForeignKey(name = "cuit_cliente_servicios_clientes")),
            inverseJoinColumns = @JoinColumn(name = "id_servicio",foreignKey=@ForeignKey(name = "id_servicio_servicios_clientes")))
    @Setter(AccessLevel.NONE)
    private Set<Servicio> servicios = new HashSet<>();
    @OneToMany(mappedBy = "cliente")
    @Setter(AccessLevel.NONE)
    private Set<Incidente> incidentes = new HashSet<>();
    public void addServicio(Servicio servicio){
        servicios.add(servicio);
        servicio.getClientes().add(this);
    }
    public void addIncidente(Incidente incidente){
        incidentes.add(incidente);
        incidente.setCliente(this);
    }
    public void removeServicio(Servicio servicio){
        servicios.remove(servicio);
        servicio.getClientes().remove(this);
    }
    public void removeIncidente(Incidente incidente){
        incidentes.remove(incidente);
        incidente.setCliente(null);
    }
    public Cliente(String cuit, String razonSocial){
        this.cuit = cuit;
        this.razonSocial = razonSocial;
    }
}
