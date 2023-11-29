package org.example.controllers;

import org.example.DAO.ProblemaDAO;
import org.example.DAO.TecnicoDAO;
import org.example.models.Problema;
import org.example.models.Tecnico;

public class ProblemaController {
    private ProblemaDAO problemaDAO;

    public ProblemaController() {
        this.problemaDAO = new ProblemaDAO();
    }

    public void create(Problema problema) {problemaDAO.create(problema); }

    public Problema update(Problema problema) {
        return problemaDAO.update(problema);
    }

    public void delete(Problema problema) {
        problemaDAO.delete(problema);
    }

}
