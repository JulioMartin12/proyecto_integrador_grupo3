package org.example.models;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "SERVICIO")
public class Servicio {
    @Getter(value = AccessLevel.NONE)

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 45, nullable = false)
    private String nombre;

}
