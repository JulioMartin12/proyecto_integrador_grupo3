package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter @Getter
public class Problema {
    private int id;
    private String nombre;
    private String descripcion;
    private int tiempoSolucion;
    private List<Especialidad> especialidades;
}
