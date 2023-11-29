package org.example.DAO;

import org.example.models.Incidente;

import java.util.Collection;
import java.util.Optional;

public class IncidenteDAO extends  AbstractJpaDAO<Incidente>{

    public  IncidenteDAO(){
        setClazz(Incidente.class);
    }

}
