package org.example;
import org.example.menus.MenuPrincipal;
import org.example.seeders.PrincipalSeeder;


public class App {
    public static void main(String[] args) {

  PrincipalSeeder principalSeeder = new PrincipalSeeder();
        MenuPrincipal menuPrincipal= new MenuPrincipal();
       /*ClienteService clienteService = new ClienteService();
        Cliente cliente = new Cliente("jorge","as");
        cliente.setCuit("44435444");
        clienteService.crear(cliente);
        System.out.println("Todos los clientes son: "+ clienteService.findAll().toString() );



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
        System.out.println("Todos los problemas son: "+ problemas.toString());*/

    }

}