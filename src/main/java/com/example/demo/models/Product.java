package com.example.demo.models;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String description;
    @ManyToOne
    private Category category;
    private String image;
    private double price;
    private int quantity;
    private LocalDate dateAdded;
    public Product(){}
}
