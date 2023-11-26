import org.example.config.DBConfig;
import org.example.models.Cliente;
import org.example.models.Tecnico;

import javax.persistence.EntityManager;

public class TecnicoTest {
    public static void main(String[] args) {
        System.out.println("Probando configuración de la BD con JPA");

        try {
            EntityManager em = DBConfig.getEntityManager();
            System.out.println("Conexión exitosa a la base de datos");

            // Codigo a testear

            Tecnico tecnico = new Tecnico();
            tecnico.setNombre("jorge");
            tecnico.setApellido("tete");
            em.getTransaction().begin();
            if (tecnico != null){
                em.persist(tecnico);
            }
            em.getTransaction().commit();


        } catch (Exception e) {
            // Capturar excepciones en caso de que la conexión falle
            e.printStackTrace();
            System.out.println("Fallo en la conexión a la base de datos");
        }
    }
}
