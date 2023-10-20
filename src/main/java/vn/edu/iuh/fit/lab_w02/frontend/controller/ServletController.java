package vn.edu.iuh.fit.lab_w02.frontend.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.edu.iuh.fit.lab_w02.frontend.model.CusomerModel;

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
            }else {
                resp.sendRedirect("Customers.jsp");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
