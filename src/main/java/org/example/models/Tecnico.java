package org.example.models;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
public class Tecnico {
    /* TODO El sistema debe dar la posibilidad de informar:
        Quién fue el técnico con más incidentes resueltos en los últimos N días
        Quién fue el técnico con más incidentes resueltos de una determinada
        especialidad en los últimos N días
        Quién fue el técnico que más rápido resolvió los incidentes
     */
    @Getter
    private int id;
    @Setter @Getter
    private int incidentesResueltos;
    @Setter @Getter
    private String nombre;
    @Setter @Getter
    private String apellido;
    @Setter @Getter
    private List<Especialidad> especialidades;
}
