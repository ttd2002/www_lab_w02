package vn.edu.iuh.fit.lab_w02.backend.resources;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.checkerframework.checker.units.qual.C;
import vn.edu.iuh.fit.lab_w02.backend.models.Customer;
import vn.edu.iuh.fit.lab_w02.backend.services.CustomerServices;

import java.util.List;

@Path("/Customers")
public class CustomerResources {
    private CustomerServices services = new CustomerServices();
    @POST
    @Consumes("application/json")
    public Response insert(Customer cust)
    {
        services.inserCust(cust);
        return Response.ok(cust).build();
    }
    @GET
    @Produces("application/json")
    public Response getAll(){
        List<Customer> lst = services.getAll();
        return Response.ok(lst).build();
    }
    @GET
    @Produces("application/json")
    public Response delete(long id){
        services.deleteCust(id);
        return Response.ok(id).build();
    }
    @GET
    @Produces("application/json")
    public Response update(Customer cust){
        services.updateCust(cust);
        return Response.ok(cust).build();
    }

}
