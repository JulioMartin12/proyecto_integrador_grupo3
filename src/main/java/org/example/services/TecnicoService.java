package org.example.services;

import org.example.controllers.TecnicoController;
import org.example.models.Tecnico;

import java.util.List;

public class TecnicoService {

    private TecnicoController tecnicoController;

    public TecnicoService(){
        this.tecnicoController = new TecnicoController();
    }

    public  void create(Tecnico tecnico){
       tecnicoController.create(tecnico);
    }

    public List<Tecnico> findAll(){
        return tecnicoController.findAll();
    }
}
