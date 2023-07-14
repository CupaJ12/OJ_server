package com.example.demo.controller;
import com.example.demo.models.Product;
import com.example.demo.service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
@CrossOrigin
public class ProductController {
    private ProductService productService;
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping
    public Iterable<Product> getAllProducts(){
        return this.productService.getAllProducts();
    }
    @PostMapping
    public Product postNewProduct(@RequestBody Product product){
        return this.productService.postNewProduct(product);
    }
}
