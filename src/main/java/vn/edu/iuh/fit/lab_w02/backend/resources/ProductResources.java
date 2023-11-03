package vn.edu.iuh.fit.lab_w02.backend.resources;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import vn.edu.iuh.fit.lab_w02.backend.models.Employee;
import vn.edu.iuh.fit.lab_w02.backend.models.Product;
import vn.edu.iuh.fit.lab_w02.backend.services.ProductService;

import java.util.List;

public class ProductResources {
    private ProductService service;
    public ProductResources(){
        service = new ProductService();
    }

    @GET
    @Produces("application/json")
    public Response getAll() {
        List<Product> lst = service.getAllProduct();
        return Response.ok(lst).build();
    }

    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public Response insert(Product product) {
        //ResponseEntity
        service.insertProduct(product);
        return Response.ok(product).build();
    }
}
