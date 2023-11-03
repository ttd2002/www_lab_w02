package vn.edu.iuh.fit.lab_w02.backend.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import vn.edu.iuh.fit.lab_w02.backend.db.ConnectionDB;
import vn.edu.iuh.fit.lab_w02.backend.enums.ProductStatus;
import vn.edu.iuh.fit.lab_w02.backend.models.Employee;
import vn.edu.iuh.fit.lab_w02.backend.models.Product;

import java.util.List;

public class ProductRepository {
    private EntityManager em;
    private EntityTransaction trans;

    public ProductRepository() {
        em = ConnectionDB.getConnection();
        trans = em.getTransaction();
    }

    public void insertProduct(Product product) {
        try {
            trans.begin();
            em.persist(product);
            trans.commit();
        }catch (Exception e){
            trans.rollback();
            e.printStackTrace();
        }
    }

    public List<Product> getAllProduct() {
        return em.createNamedQuery("Product.findAll", Product.class)
                .setParameter("statusActive", ProductStatus.ACTIVE)
                .getResultList();
    }
}
