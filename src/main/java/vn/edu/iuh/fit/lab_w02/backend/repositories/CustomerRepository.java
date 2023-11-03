package vn.edu.iuh.fit.lab_w02.backend.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import vn.edu.iuh.fit.lab_w02.backend.db.ConnectionDB;
import vn.edu.iuh.fit.lab_w02.backend.models.Customer;

import java.util.List;
import java.util.Optional;

public class CustomerRepository {
    private EntityManager em;
    private EntityTransaction trans;

    public CustomerRepository(){
        em = ConnectionDB.getConnection();
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
    public void deleteCustomer(long cust_id){
        try {
            trans.begin();
            em.remove(em.find(Customer.class,cust_id));
            trans.commit();
        }catch (Exception ex){
            trans.rollback();
        }
    }
    public void updateCustomer(Customer cust){
        try {
            trans.begin();
            em.merge(cust);
            trans.commit();
        }catch (Exception ex){
            trans.rollback();
        }
    }
    public Optional<Customer> findCustbyId(long id){
        Customer customer = em.find(Customer.class,id);
        return customer == null? Optional.empty() : Optional.of(customer);
    }
    public List<Customer> getAllCust(){
        return em.createNamedQuery("Customer.findAll",Customer.class).getResultList();
    }
}
