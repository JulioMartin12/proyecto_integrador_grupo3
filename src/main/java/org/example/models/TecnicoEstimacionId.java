package org.example.models;

import lombok.*;

import java.io.Serializable;
@Data
public class TecnicoEstimacionId implements Serializable {
    // Esta clase solo sirve para almacenar los ID de la tabla intermediaria estimaciones
    private int tecnico;
    private int tipoProblema;
}
