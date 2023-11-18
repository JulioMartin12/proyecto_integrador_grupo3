package org.example;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Setter @Getter
public class Tecnico {
    /* TODO El sistema debe dar la posibilidad de informar:
        Quién fue el técnico con más incidentes resueltos en los últimos N días
        Quién fue el técnico con más incidentes resueltos de una determinada
        especialidad en los últimos N días
        Quién fue el técnico que más rápido resolvió los incidentes
     */
    private int id;
    private int incidentesResueltos;
    private String nombre;
    private String apellido;
    private List<Especialidad> especialidades;
}
