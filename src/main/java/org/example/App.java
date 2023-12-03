package org.example;

import org.example.config.DBConfig;
import org.example.controllers.ServicioController;
import org.example.models.*;
import org.example.services.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.time.LocalDateTime;
import java.util.List;

public class App {
    public static void main(String[] args) {


        ClienteService clienteService = new ClienteService();
        Cliente cliente = new Cliente("jorge","as");
        cliente.setCuit("44435444");
        clienteService.crear(cliente);
        System.out.println("Todos los clientes son: "+ clienteService.findAll().toString() );

        TecnicoService tecnicoService = new TecnicoService();
        Tecnico tecnico = new Tecnico("Juan","Martón");
        tecnicoService.create(tecnico);

        List<Tecnico> tecnicos = tecnicoService.findAll();

        System.out.println(tecnicos.toString());


        ServicioService servicioService = new ServicioService();
        Servicio servicio = new Servicio();
        servicio.setNombre("test");
        servicioService.create(servicio);


        IncidenteService incidenteService = new IncidenteService();
        Incidente incidente = new Incidente(Estado.SINREVISAR,LocalDateTime.now());
        incidente.setCliente(cliente);
        incidente.setServicio(servicio);
        incidente.setTecnico(tecnico);
        incidenteService.creat(incidente);
        System.out.println("Todos los Incidentes son: "+incidenteService.findAll().toString());



        EspecialidadService especialidadservice = new EspecialidadService();
        especialidadservice.create(new Especialidad("especialidadTest"));
        List<Especialidad> especialidades = especialidadservice.findall();
        System.out.println("Todas las especialidades son: " + especialidades.toString());

        ProblemaService problemaService = new ProblemaService();
        Problema problema = new Problema();
        problema.setNombre("problemaTest");
        problema.setIncidente(incidente);

        problemaService.create(problema);
        List<Problema> problemas = problemaService.findall();
        System.out.println("Todos los problemas son: "+ problemas.toString());

    }

    public static  void oldMain(){
        EntityManager em = DBConfig.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        tx.commit();
    }
}