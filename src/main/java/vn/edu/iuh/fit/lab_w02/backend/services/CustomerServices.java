package vn.edu.iuh.fit.lab_w02.backend.services;

import org.checkerframework.checker.units.qual.C;
import vn.edu.iuh.fit.lab_w02.backend.models.Customer;
import vn.edu.iuh.fit.lab_w02.backend.repositories.CustomerRepository;

import java.util.List;
import java.util.Optional;

public class CustomerServices {
    private CustomerRepository repository;
    public CustomerServices(){
        repository = new CustomerRepository();
    }
    public void inserCust(Customer cust){
        repository.insertCustomer(cust);
    }
    public void deleteCust(long cust_id){
        repository.deleteCustomer(cust_id);
    }
    public void updateCust(Customer cust){
        repository.updateCustomer(cust);
    }
    public Optional<Customer> findCustbyId(long id){
        return repository.findCustbyId(id);
    }

    public List<Customer> getAll(){
        return repository.getAllCust();
    }
}
