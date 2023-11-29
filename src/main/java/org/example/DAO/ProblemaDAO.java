package org.example.DAO;

import org.example.models.Problema;

public class ProblemaDAO extends AbstractJpaDAO<Problema>{
    public ProblemaDAO(){
        setClazz(Problema.class);
    }
}
