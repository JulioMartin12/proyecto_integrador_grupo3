package org.example.models;

import com.sun.xml.bind.v2.TODO;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.models.estados.Estado;

import java.util.Date;
@Setter
@Getter
@NoArgsConstructor
public class Incidente {
    @Getter(value = AccessLevel.NONE)
    private int id;
    private Estado estado;
    private Problema problema;
    private Date fechaDeInicio;
    private Date fechaResolucion;

    // TODO: El constructor se verá que datos vamos a necesitar.
}
