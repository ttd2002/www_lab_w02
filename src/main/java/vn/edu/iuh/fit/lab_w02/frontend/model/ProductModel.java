package vn.edu.iuh.fit.lab_w02.frontend.model;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.edu.iuh.fit.lab_w02.backend.enums.ProductStatus;
import vn.edu.iuh.fit.lab_w02.backend.models.Product;
import vn.edu.iuh.fit.lab_w02.backend.services.ProductService;

import java.io.IOException;

public class ProductModel {
    private ProductService service = new ProductService();

    public void insertProduct(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");
        String decs = req.getParameter("decs");
        String unit = req.getParameter("unit");
        String manu = req.getParameter("manu");
        Product product = new Product(name,decs,unit,manu, ProductStatus.ACTIVE);
        service.insertProduct(product);
        resp.sendRedirect("Products.jsp");
    }
}
