import org.example.config.DBConfig;
import org.example.models.Cliente;

import javax.persistence.EntityManager;

public class ClienteTest {
    public static void main(String[] args) {
        System.out.println("Probando configuración de la BD con JPA");

        try {
            DBConfig.generateSchema(); // Genero las tablas de la DB
            EntityManager em = DBConfig.getEntityManager();
            System.out.println("Conexión exitosa a la base de datos");
            // Codigo a testear

            Cliente cliente = new Cliente("cuitprueba1", "razon social prueba1");
            //Cliente cliente = em.find(Cliente.class, "cuitprueba1"); // esto seria para encontrar un cliente que ya existe
            em.getTransaction().begin();
            em.merge(cliente); // se puede usar persist para crear campos pero tira error cuando ya existen y merge no
            em.getTransaction().commit();
            // esto deberia haber generado un cliente en la tabla clientes


        } catch (Exception e) {
            // Capturar excepciones en caso de que la conexión falle
            e.printStackTrace();
            System.out.println("Fallo en la conexión a la base de datos");
        }
    }
}
