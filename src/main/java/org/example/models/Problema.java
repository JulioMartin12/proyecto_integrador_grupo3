package org.example.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Problema {
    @Getter
    private int id;
    @Setter @Getter
    private String nombre;
    @Setter @Getter
    private String descripcion;
    @Setter @Getter
    private int tiempoSolucion;
    @Setter @Getter
    private List<Especialidad> especialidades;
}
