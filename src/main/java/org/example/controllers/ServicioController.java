package org.example.controllers;

import org.example.DAO.ServicioDAO;
import org.example.models.Servicio;

import java.util.List;

public class ServicioController {
    private ServicioDAO servicioDAO;

    public ServicioController(){
        this.servicioDAO = new ServicioDAO();
    }

    public void create(Servicio servicio){ servicioDAO.create(servicio);}

    public List<Servicio> findall(){return this.servicioDAO.findAll();}

}
