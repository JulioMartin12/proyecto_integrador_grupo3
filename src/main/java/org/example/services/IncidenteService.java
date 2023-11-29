package org.example.services;

import org.example.controllers.IncidenteController;
import org.example.models.Incidente;

public class IncidenteService {

    private IncidenteController incidenteController = new IncidenteController();

    public void creat (Incidente incidente){
        this.incidenteController.create(incidente);
    }
}
