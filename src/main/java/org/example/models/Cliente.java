package org.example.models;

import lombok.*;
import javax.persistence.*;


@AllArgsConstructor @RequiredArgsConstructor @NoArgsConstructor(force = true)
@Setter @Getter @ToString
@Entity @Table(name = "clientes")
public class Cliente {
    @Id @NonNull @Column(name = "cuit", length = 11)
    private String cuit;
    @NonNull @Column(name = "razon_social", nullable = false, length = 45)
    private String razonSocial;
    @Column(name = "email", length = 320) // una direccion email puede llegar a tener 320 caracteres
    private String email;

}
