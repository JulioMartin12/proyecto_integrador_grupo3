package org.example.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class Problema {
    @Getter(value = AccessLevel.NONE)
    private int id;
    private String nombre;
    private String descripcion;
    private int tiempoSolucion;
    private List<Especialidad> especialidades;

    // TODO: El constructor se verá que datos vamos a necesitar.
}
