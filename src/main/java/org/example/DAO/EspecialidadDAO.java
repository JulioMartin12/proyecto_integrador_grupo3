package org.example.DAO;

import org.example.models.Especialidad;

public class EspecialidadDAO extends AbstractJpaDAO<Especialidad, Integer> {

    public EspecialidadDAO(){
        setClase(Especialidad.class);
    }

}
