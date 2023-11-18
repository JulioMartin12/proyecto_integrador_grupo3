package org.example;

import lombok.Getter;
import lombok.Setter;
import org.example.estados.Estado;

import java.util.Date;
@Setter @Getter
public class Incidente {
    private Estado estado;
    private Aplicacion aplicacion;
    private Problema problema;
    private Date fechaDeInicio;
    private Date fechaResolucion;
}
