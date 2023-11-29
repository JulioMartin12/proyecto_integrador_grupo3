package org.example.controllers;

import org.example.DAO.EspecialidadDAO;
import org.example.DAO.ProblemaDAO;
import org.example.models.Especialidad;
import org.example.models.Problema;

public class EspecialidadController {

    private EspecialidadDAO especialidadDAO;

    public EspecialidadController() {
        this.especialidadDAO = new EspecialidadDAO();
    }

    public void create(Especialidad especialidad) {especialidadDAO.create(especialidad); }

    public Especialidad update(Especialidad especialidad) {
        return especialidadDAO.update(especialidad);
    }

    public void delete(Especialidad especialidad) {
        especialidadDAO.delete(especialidad);
    }


}
