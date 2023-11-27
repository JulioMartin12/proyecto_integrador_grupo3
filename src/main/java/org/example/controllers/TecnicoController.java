package org.example.controllers;

import org.example.DAO.TecnicoDAO;
import org.example.models.Tecnico;

public class TecnicoController {
    private TecnicoDAO tecnicoDAO;

    public TecnicoController() {
        this.tecnicoDAO = new TecnicoDAO();
    }

    public void create(Tecnico tecnico) {tecnicoDAO.create(tecnico); }

    public Tecnico update(Tecnico tecnico) {
        return tecnicoDAO.update(tecnico);
    }

    public void delete(Tecnico tecnico) {
        tecnicoDAO.delete(tecnico);
    }


}



