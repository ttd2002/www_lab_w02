package vn.edu.iuh.fit.lab_w02.backend.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import vn.edu.iuh.fit.lab_w02.backend.db.ConnectionDB;
import vn.edu.iuh.fit.lab_w02.backend.enums.EmployeeStatus;
import vn.edu.iuh.fit.lab_w02.backend.models.Employee;

import java.util.List;
import java.util.Optional;

public class EmployeeRepository {
    private EntityManager em;
    private EntityTransaction trans;
    public EmployeeRepository() {
        em = ConnectionDB.getConnection();
        trans = em.getTransaction();
    }

    public void insertEmp(Employee employee) {
        try {
            trans.begin();
            em.persist(employee);
            trans.commit();
        }
        catch (Exception e){
            em.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void setStatus(Employee employee) {
        try {
            trans.begin();
            employee.setStatus(EmployeeStatus.TERMINATED);
            em.merge(employee);
            trans.commit();
        }
        catch (Exception e){
            trans.rollback();
            e.printStackTrace();
        }
    }

    public void update(Employee employee) {
        em.merge(em);
    }

    public Optional<Employee> findbyId(long id) {
        Employee emp = em.find(Employee.class,id);
        return emp == null ? Optional.empty():Optional.of(emp);
    }

    public List<Employee> getAllEmp() {
        return em.createNamedQuery("Employee.findAll", Employee.class)
                .setParameter("statusActive",EmployeeStatus.ACTIVE)
                .getResultList();
    }
}
