package org.example.DAO;

import org.example.models.Servicio;

public class ServicioDAO extends AbstractJpaDAO<Servicio>{

    public ServicioDAO(){
        setClazz(Servicio.class);
    }

}
