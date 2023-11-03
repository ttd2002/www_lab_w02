package vn.edu.iuh.fit.lab_w02.frontend.model;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.edu.iuh.fit.lab_w02.backend.enums.EmployeeStatus;
import vn.edu.iuh.fit.lab_w02.backend.models.Employee;
import vn.edu.iuh.fit.lab_w02.backend.services.EmployeeServices;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class EmployeeModel {
    private EmployeeServices services = new EmployeeServices();
    public void insertEmp(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");
        String dob = req.getParameter("dob");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String address = req.getParameter("address");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birth_date = LocalDate.parse(dob,formatter);
        Employee emp = new Employee(name,birth_date,email,phone,address, EmployeeStatus.ACTIVE);
        services.insertEmp(emp);
        resp.sendRedirect("Employees.jsp");
    }
    public void deleteEmp(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        long id = Long.parseLong(req.getParameter("id"));
        Optional<Employee> emp =  services.findById(id);
        services.delete_Emp(emp.get());


        resp.sendRedirect("Employees.jsp");
    }
}
