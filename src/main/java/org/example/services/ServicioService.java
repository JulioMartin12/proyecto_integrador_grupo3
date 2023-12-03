package org.example.services;

import org.example.controllers.EspecialidadController;
import org.example.controllers.ServicioController;
import org.example.models.Especialidad;
import org.example.models.Servicio;

import java.util.List;

public class ServicioService {
    private ServicioController servicioController;

    public ServicioService() {
        this.servicioController = new ServicioController();
    }

    public void create(Servicio servicio){
        servicioController.create(servicio);
    }

    public List<Servicio> findall(){return servicioController.findall();}
}
