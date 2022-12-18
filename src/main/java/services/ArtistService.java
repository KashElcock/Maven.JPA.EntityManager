package services;

import entities.Artist;
import jakarta.persistence.*;

import java.util.List;

public class ArtistService   {
    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu");
    private EntityManager entityManager = entityManagerFactory.createEntityManager();
    private EntityTransaction entityTransaction = entityManager.getTransaction();

    public Artist findById(int id){
        return entityManager.find(Artist.class, id);
    }
}
