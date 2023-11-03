package vn.edu.iuh.fit.lab_w02.backend.db;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ConnectionDB {
    private static EntityManagerFactory emf;

    public static EntityManager getConnection(){
        if (emf == null){
            emf = Persistence.createEntityManagerFactory("lab_week_2");
        }
        return emf.createEntityManager();
    }
    public static void closeConnection(){
        if (emf != null && emf.isOpen()){
            emf.close();
        }
    }
}
