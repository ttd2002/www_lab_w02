package vn.edu.iuh.fit.lab_w02.frontend.model;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.edu.iuh.fit.lab_w02.backend.models.Customer;
import vn.edu.iuh.fit.lab_w02.backend.services.CustomerServices;

import java.io.IOException;
import java.util.Optional;

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
    public void deteleCustomer(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        long id = Long.parseLong(req.getParameter("id"));
        services.deleteCust(id);

        resp.sendRedirect("Customers.jsp");
    }
    public void updateCustomer(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        long id = Long.parseLong(req.getParameter("Custid"));

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String address = req.getParameter("address");

        Customer newCustomer = new Customer(id,name,email,phone,address);
        System.out.println(newCustomer);
        services.updateCust(newCustomer);
        resp.sendRedirect("Customers.jsp");
    }
    public void loadForm(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        long id = Long.parseLong(req.getParameter("CustId"));
        Optional<Customer> cust = services.findCustbyId(id);
        req.setAttribute("cust",cust);
        req.getRequestDispatcher("update_Customer.jsp").forward(req,resp);

    }

}
