package org.example;

import org.example.config.DBConfig;
import org.example.models.Estado;
import org.example.models.Incidente;
import org.example.models.Tecnico;
import org.example.models.TipoProblema;
import org.example.services.IncidenteService;
import org.example.services.TecnicoService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        TecnicoService tecnicoService = new TecnicoService();
        tecnicoService.create(new Tecnico("Juan","Martón"));
        List<Tecnico> tecnicos = tecnicoService.findAll();

        System.out.println(tecnicos.toString());

        IncidenteService incidenteService = new IncidenteService();
        Incidente incidente = new Incidente(Estado.SINREVISAR,LocalDateTime.now());
        incidenteService.creat(incidente);
    }

    public static  void oldMain(){
        EntityManager em = DBConfig.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        tx.commit();
    }
}