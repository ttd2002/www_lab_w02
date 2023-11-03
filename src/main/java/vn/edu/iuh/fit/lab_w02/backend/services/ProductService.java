package vn.edu.iuh.fit.lab_w02.backend.services;

import vn.edu.iuh.fit.lab_w02.backend.models.Product;
import vn.edu.iuh.fit.lab_w02.backend.repositories.ProductRepository;

import java.util.List;

public class ProductService {
    private ProductRepository repository;

    public ProductService(){
        try {
            repository = new ProductRepository();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public List<Product> getAllProduct() {
        return repository.getAllProduct();
    }
    public void insertProduct(Product product) {
        repository.insertProduct(product);
    }
}
