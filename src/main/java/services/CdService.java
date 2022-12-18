package services;


import entities.CD;
import jakarta.persistence.*;

import java.util.List;


public class CdService {
    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu");
    private EntityManager entityManager = entityManagerFactory.createEntityManager();
    private EntityTransaction entityTransaction = entityManager.getTransaction();

    public CD findById(int id){
        return entityManager.find(CD.class, id);
    }
}
