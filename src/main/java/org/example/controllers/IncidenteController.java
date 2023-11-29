package org.example.controllers;

import org.example.DAO.IncidenteDAO;
import org.example.models.Incidente;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public class IncidenteController {
    private IncidenteDAO incidenteDAO;

    public IncidenteController() {
        this.incidenteDAO = new IncidenteDAO();
    }

    public  void create(Incidente incidente){
        this.incidenteDAO.create(incidente);

    }

    public void delete (Incidente incidente){
              this.incidenteDAO.delete(incidente);
    }

    public List<Incidente> findAll(){
        return  this.incidenteDAO.findAll();

    }
     public  Incidente findOne(Incidente incidente){
        return this.findOne(incidente);
    }

    public  void update(Incidente incidente){
        this.incidenteDAO.update(incidente);
    }
}
