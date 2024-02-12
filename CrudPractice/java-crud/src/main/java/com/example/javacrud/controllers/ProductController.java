package com.example.javacrud.controllers;

import com.example.javacrud.domain.product.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    private ProductRepository repository;

    @GetMapping
    public ResponseEntity<?> listAllProducts() {
        List<ProductResponseDTO> products =repository.findAll().stream().map(ProductResponseDTO::new).toList();
        return ResponseEntity.ok(products);
    }

    @PostMapping
    public ResponseEntity<?> saveProduct(@RequestBody @Valid ProductRequestDTO data) {
        Product product = new Product(data);
        repository.save(product);
        return ResponseEntity.ok(product);
    }

    @PutMapping
    public ResponseEntity<?> updateProduct(@RequestBody @Valid ProductUpdateDTO data) {
        Optional<Product> optProduct = repository.findById(data.id());
        if (optProduct.isPresent()) {
            Product product = optProduct.get();
            if (data.name() != null)
                product.setName(data.name());
            if (data.price() != null)
                product.setPrice(data.price());
            repository.save(product);
            return ResponseEntity.ok(product);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping
    public ResponseEntity<?> deleteProduct(@RequestBody @Valid ProductDeleteDTO data) {
        repository.deleteById(data.id());
        return ResponseEntity.noContent().build();
    }
}
