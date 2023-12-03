package models;

import org.example.config.DBConfig;
import org.example.models.Cliente;
import org.example.models.Servicio;

import javax.persistence.EntityManager;

public class ClienteTest {
    public static void main(String[] args) {
        EntityManager em = DBConfig.getEntityManager();
        em.getTransaction().begin();
        Cliente cliente = new Cliente("00123456780","Razon social test");
        Servicio servicio = new Servicio("Servicio nombre test");
        cliente.getServicios().add(servicio); // es importante hacer el add en ambas clases. NO OLVIDAR ESTO
        servicio.getClientes().add(cliente);
        em.persist(cliente);
        em.persist(servicio);
        em.getTransaction().commit();
        // esto deberia insertar un cliente y un servicio y relacionarlos en la tabla servicios_clientes
        // puede dar algun error la primera vez que se ejecuta
    }
}
