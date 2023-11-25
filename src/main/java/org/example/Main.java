package org.example;

import org.example.config.DBConfig;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola julio!");
        String persistenceUnitName = "JPA_PU";

        try {
            // Crear EntityManagerFactory
            EntityManagerFactory emf = Persistence.createEntityManagerFactory(persistenceUnitName);

            // Crear EntityManager
            EntityManager em = emf.createEntityManager();

            // Si llegamos hasta aquí sin excepciones, la conexión es exitosa
            System.out.println("Conexión exitosa a la base de datos");

            // Cerrar EntityManager y EntityManagerFactory
            em.close();
            emf.close();
        } catch (Exception e) {
            // Capturar excepciones en caso de que la conexión falle
            e.printStackTrace();
            System.out.println("Fallo en la conexión a la base de datos");
        }
    }
}