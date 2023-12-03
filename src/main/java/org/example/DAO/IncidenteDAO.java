package org.example.DAO;

import org.example.models.Incidente;


public class IncidenteDAO extends  AbstractJpaDAO<Incidente, Integer>{

    public  IncidenteDAO(){
        setClase(Incidente.class);
    }

}
