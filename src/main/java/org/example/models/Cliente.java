package org.example.models;

import lombok.*;
import javax.persistence.*;


@AllArgsConstructor @RequiredArgsConstructor @NoArgsConstructor(force = true)
@Setter @Getter @ToString
@Entity @Table(name = "cliente")
public class Cliente {
    @Id @NonNull
    private String cuit;
    @Column(name = "razon_social", nullable = false) @NonNull
    private String razonSocial;
    private String email;

}
