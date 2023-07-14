package com.example.demo.service;
import com.example.demo.models.Category;
import com.example.demo.models.Product;
import com.example.demo.repository.CategoryRepo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
@Service
public class CategoryService {
    private CategoryRepo categoryRepo;
    public CategoryService(CategoryRepo categoryRepo){
        this.categoryRepo = categoryRepo;
    }
    public Iterable<Category> getAllCategories() {
        return categoryRepo.findAll();
    }
}
