package vn.edu.iuh.fit.lab_w02.frontend.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.edu.iuh.fit.lab_w02.frontend.model.CusomerModel;
import vn.edu.iuh.fit.lab_w02.frontend.model.EmployeeModel;
import vn.edu.iuh.fit.lab_w02.frontend.model.ProductModel;

import java.io.IOException;

@WebServlet("/controls")
public class ServletController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Object actionObject = req.getParameter("action");
            if (actionObject != null) {
                String action = actionObject.toString();
                if (action.equalsIgnoreCase("Insert_customer")){
                    CusomerModel custModel = new CusomerModel();
                    custModel.insertCustomer(req,resp);
                }
                if (action.equalsIgnoreCase("update_customer")){
                    CusomerModel custModel = new CusomerModel();
                    custModel.updateCustomer(req,resp);
                }
                if (action.equalsIgnoreCase("Insert_employee")){
                    EmployeeModel empModel = new EmployeeModel();
                    empModel.insertEmp(req,resp);
                }
                if (action.equalsIgnoreCase("Insert_product")){
                    ProductModel proModel = new ProductModel();
                    proModel.insertProduct(req, resp);
                }
            }else {
                resp.sendRedirect("Customers.jsp");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Object actionObject = req.getParameter("action");
            if (actionObject != null) {
                String action = actionObject.toString();
                if (action.equalsIgnoreCase("delete_Customer")){
                    CusomerModel custModel = new CusomerModel();
                    custModel.deteleCustomer(req,resp);
                }
                if (action.equalsIgnoreCase("delete_Employee")){
                    EmployeeModel employeeModel = new EmployeeModel();
                    employeeModel.deleteEmp(req,resp);
                }
                if (action.equalsIgnoreCase("loadForm")){
                    CusomerModel custModel = new CusomerModel();
                    custModel.loadForm(req,resp);
                }

            }else {
                resp.sendRedirect("Customers.jsp");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
