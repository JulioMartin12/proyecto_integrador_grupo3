package org.example.DAO;

import org.example.models.Especialidad;

public class EspecialidadDAO extends AbstractJpaDAO<Especialidad> {

    public EspecialidadDAO(){
        setClazz(Especialidad.class);
    }

}
