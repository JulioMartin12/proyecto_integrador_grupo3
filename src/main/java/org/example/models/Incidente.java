package org.example.models;

import lombok.Getter;
import lombok.Setter;
import org.example.models.estados.Estado;

import java.util.Date;
public class Incidente {
    @Getter
    private int id;
    @Setter @Getter
    private Estado estado;
    @Setter @Getter
    private Aplicacion aplicacion;
    @Setter @Getter
    private Problema problema;
    @Setter @Getter
    private Date fechaDeInicio;
    @Setter @Getter
    private Date fechaResolucion;
}
