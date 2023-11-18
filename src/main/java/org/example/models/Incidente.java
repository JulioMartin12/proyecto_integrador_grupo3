package org.example.models;

import lombok.Getter;
import lombok.Setter;
import org.example.models.estados.Estado;

import java.util.Date;
@Setter @Getter
public class Incidente {
    @Getter
    private int id;
    private Estado estado;
    private Aplicacion aplicacion;
    private Problema problema;
    private Date fechaDeInicio;
    private Date fechaResolucion;
}
