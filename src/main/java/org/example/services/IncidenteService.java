package org.example.services;

import org.example.controllers.IncidenteController;
import org.example.models.Incidente;

import java.util.List;

public class IncidenteService {

    private IncidenteController incidenteController = new IncidenteController();


    public void creat (Incidente incidente){
        this.incidenteController.create(incidente);
    }

    public List<Incidente> findAll(){
        return  this.incidenteController.findAll();
    }
}
