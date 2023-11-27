package org.example.DAO;

import org.example.models.Tecnico;

public class TecnicoDAO extends AbstractJpaDAO<Tecnico> {
    public TecnicoDAO() {
        setClazz(Tecnico.class);
}

}