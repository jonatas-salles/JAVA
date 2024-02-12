package com.example.javacrud.domain.product;

import jakarta.persistence.*;
import lombok.*;

@Table(name="product")
@Entity(name="product")
@EqualsAndHashCode(of="id")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private Float price;

    public Product(ProductRequestDTO data) {
        this.name = data.name();
        this.price = data.price();
    }
}
