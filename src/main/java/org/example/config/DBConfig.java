package org.example.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import  java.sql.Statement;

public class DBConfig {

    static EntityManagerFactory factory = null;
    public static void generateSchema(){
        Persistence.generateSchema("JPA_PU",null);
    }
    public static EntityManager getEntityManager(){
        if(factory == null)
            factory = Persistence.createEntityManagerFactory("JPA_PU");
        return factory.createEntityManager();
    }


}

