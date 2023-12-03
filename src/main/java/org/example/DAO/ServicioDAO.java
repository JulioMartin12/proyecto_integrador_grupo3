package org.example.DAO;

import org.example.models.Servicio;

public class ServicioDAO extends AbstractJpaDAO<Servicio, Integer>{

    public ServicioDAO(){
        setClase(Servicio.class);
    }

}
