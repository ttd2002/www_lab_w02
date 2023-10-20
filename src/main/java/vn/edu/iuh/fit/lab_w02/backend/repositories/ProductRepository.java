package vn.edu.iuh.fit.lab_w02.backend.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import vn.edu.iuh.fit.lab_w02.backend.models.Employee;
import vn.edu.iuh.fit.lab_w02.backend.models.Product;

import java.util.List;

public class ProductRepository {
    private EntityManager em;
    private EntityTransaction transaction;

    public ProductRepository() {
        em = Persistence
                .createEntityManagerFactory("lab_week_2")
                .createEntityManager();
    }

    public void insert(Product product) {
        em.persist(product);
        /*try {
            transaction.begin();
            em.persist(product);
            transaction.commit();
        }catch (Exception e){
            transaction.rollback();
            e.printStackTrace();
        }*/
    }
    public List<Product> getAllProduct() {
        return em.createNamedQuery("Product.findAll", Product.class).getResultList();
    }
}
