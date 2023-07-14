package com.example.demo.repository;
import org.springframework.stereotype.Repository;
import com.example.demo.models.Product;
import org.springframework.data.repository.CrudRepository;

import java.lang.reflect.Array;
import java.time.LocalDate;

@Repository
public interface ProductRepo extends CrudRepository<Product, Long> {
    Iterable<Product> findAllByDateAdded(LocalDate dateAdded);
}
