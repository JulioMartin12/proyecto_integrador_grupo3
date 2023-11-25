import org.example.config.DBConfig;
import org.example.models.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClienteTest {
    public static void main(String[] args) {
        System.out.println("Probando configuración de la BD con JPA");

        try {
            EntityManager em = DBConfig.getEntityManager();
            System.out.println("Conexión exitosa a la base de datos");

            // Codigo a testear

            Cliente cliente = new Cliente("cuitprueba1", "razon social prueba1");
            //Cliente cliente = em.find(Cliente.class, "cuitprueba1"); // esto seria para encontrar un cliente que ya existe
            em.getTransaction().begin();
            if (cliente != null){
                em.persist(cliente);
            }
            em.getTransaction().commit();


        } catch (Exception e) {
            // Capturar excepciones en caso de que la conexión falle
            e.printStackTrace();
            System.out.println("Fallo en la conexión a la base de datos");
        }
    }
}
