package org.example.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Servicio {
    @Getter(value = AccessLevel.NONE)
    private int id;
    private String nombre;

}
