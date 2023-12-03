package org.example.DAO;

import org.example.models.Problema;

public class ProblemaDAO extends AbstractJpaDAO<Problema, Integer>{
    public ProblemaDAO(){
        setClase(Problema.class);
    }
}
