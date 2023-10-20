package vn.edu.iuh.fit.lab_w02.backend.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import vn.edu.iuh.fit.lab_w02.backend.models.Customer;

import java.util.List;

public class CustomerRepository {
    private EntityManager em;
    private EntityTransaction trans;
    public CustomerRepository(){
        em = Persistence
                .createEntityManagerFactory("lab_week_2")
                .createEntityManager();
        trans = em.getTransaction();
    }
    public void insertCustomer(Customer cust){
        try {
            trans.begin();
            em.persist(cust);
            trans.commit();
        }catch (Exception ex){
            trans.rollback();
        }
    }
    public List<Customer> getAllCust(){
        return em.createNamedQuery("Customer.findAll",Customer.class).getResultList();
    }
}
