package com.example.demo.controller;

import com.example.demo.models.Category;
import com.example.demo.service.CategoryService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/categories")
@CrossOrigin
public class CategoryController {
    private CategoryService categoryService;
    public CategoryController (CategoryService categoryService) {this.categoryService = categoryService;}
    @GetMapping
    public Iterable<Category> getAllCategories() {
        return this.categoryService.getAllCategories();
    }
}
