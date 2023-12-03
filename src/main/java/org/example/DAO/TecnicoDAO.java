package org.example.DAO;

import org.example.models.Tecnico;

public class TecnicoDAO extends AbstractJpaDAO<Tecnico, Integer> {
    public TecnicoDAO() {
        setClase(Tecnico.class);
}

}