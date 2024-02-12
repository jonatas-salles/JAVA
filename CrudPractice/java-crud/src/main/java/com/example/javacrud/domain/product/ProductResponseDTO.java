package com.example.javacrud.domain.product;

public record ProductResponseDTO(String id, String name, Float price) {
    public ProductResponseDTO(Product product) {
        this(product.getId(), product.getName(), product.getPrice());
    }
}
