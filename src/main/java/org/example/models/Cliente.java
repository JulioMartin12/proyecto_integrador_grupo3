package org.example.models;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Data @NoArgsConstructor
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
            joinColumns = @JoinColumn(name = "CUIT_CLIENTE", foreignKey=@ForeignKey(name = "CUIT_CLIENTE_SERVICIOS_CLIENTES")),
            inverseJoinColumns = @JoinColumn(name = "ID_SERVICIO",foreignKey=@ForeignKey(name = "ID_SERVICIO_SERVICIOS_CLIENTES")))
    private Set<Servicio> servicios = new HashSet<>();
    public Cliente(String cuit, String razonSocial){
        this.cuit = cuit;
        this.razonSocial = razonSocial;
    }
}
