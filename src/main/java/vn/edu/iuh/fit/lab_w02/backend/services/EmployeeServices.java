package vn.edu.iuh.fit.lab_w02.backend.services;


import vn.edu.iuh.fit.lab_w02.backend.enums.EmployeeStatus;
import vn.edu.iuh.fit.lab_w02.backend.models.Customer;
import vn.edu.iuh.fit.lab_w02.backend.models.Employee;
import vn.edu.iuh.fit.lab_w02.backend.models.Order;
import vn.edu.iuh.fit.lab_w02.backend.repositories.EmployeeRepository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

public class EmployeeServices {
    private EmployeeRepository repository;

    public EmployeeServices() {
        repository = new EmployeeRepository();
    }

    public void insertEmp(Employee employee) {
        repository.insertEmp(employee);
    }


    public Optional<Employee> findById(long id) {
        return repository.findbyId(id);
    }
    public void delete_Emp(Employee emp){
        repository.setStatus(emp);
    }
    public boolean delete(long id) {
        Optional<Employee> op = findById(id);
        if (op.isPresent()) {
            Employee employee = op.get();
            employee.setStatus(EmployeeStatus.TERMINATED);
            return true;
        }
        return false;
    }

    public boolean activeEmp(long id) {
        Optional<Employee> op = findById(id);
        if (op.isPresent()) {
            Employee employee = op.get();
            employee.setStatus(EmployeeStatus.ACTIVE);
            return true;
        }
        return false;
    }

    public List<Employee> getAll() {
        return repository.getAllEmp();
    }

    public List<Order> getOrdersByPeriod(long empId, Date from, Date to) {
        //......
        return null;
    }
}
