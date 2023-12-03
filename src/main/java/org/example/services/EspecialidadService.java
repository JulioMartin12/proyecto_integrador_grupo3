package org.example.services;


import org.example.controllers.EspecialidadController;
import org.example.models.Especialidad;

import java.util.List;

public class EspecialidadService {

    private EspecialidadController especialidadcontroller;

    public EspecialidadService() {
        this.especialidadcontroller = new EspecialidadController();
    }
    public void create(Especialidad especialidad){
        especialidadcontroller.create(especialidad);
    }

    public List<Especialidad> findall(){return especialidadcontroller.findAll();}
}

