package org.example.services;

import com.sun.mail.util.LineInputStream;
import org.example.DAO.TecnicoDAO;
import org.example.controllers.TecnicoController;
import org.example.models.Tecnico;

import java.util.List;

public class TecnicoService {

    private TecnicoController tecnicoController = new TecnicoController();

    public  void create(Tecnico tecnico){
       tecnicoController.create(tecnico);
    }

    public List<Tecnico> findAll(){
        return tecnicoController.findAll();
    }
}
