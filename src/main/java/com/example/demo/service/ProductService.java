package com.example.demo.service;

import com.example.demo.models.Product;
import com.example.demo.repository.ProductRepo;

public class ProductService {
    private ProductRepo productRepo;
    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }
    public Iterable<Product > getAllProducts() {
        return productRepo.findAll();
    }

    public Product postNewProduct(Product product) {
        return productRepo.save(product);
    }
}
