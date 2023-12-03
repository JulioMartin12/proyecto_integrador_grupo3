package org.example.services;

import org.example.controllers.ProblemaController;
import org.example.models.Problema;

import java.util.List;

public class ProblemaService {

    private ProblemaController problemaController;

    public ProblemaService(){
        this.problemaController = new ProblemaController();
    }

    public void create(Problema problema){problemaController.create(problema);}


    public List<Problema> findall(){return this.problemaController.findall();}

}
