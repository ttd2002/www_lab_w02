package vn.edu.iuh.fit.lab_w02.frontend.model;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.edu.iuh.fit.lab_w02.backend.models.Customer;
import vn.edu.iuh.fit.lab_w02.backend.services.CustomerServices;

import java.io.IOException;

public class CusomerModel {
   private CustomerServices services = new CustomerServices();
   public void insertCustomer(HttpServletRequest req, HttpServletResponse resp) throws IOException {
       String name = req.getParameter("name");
       String email = req.getParameter("email");
       String phone = req.getParameter("phone");
       String address = req.getParameter("address");
       Customer cust = new Customer(name, email, phone, address);
       services.inserCust(cust);
       resp.sendRedirect("Customers.jsp");
   }
}
