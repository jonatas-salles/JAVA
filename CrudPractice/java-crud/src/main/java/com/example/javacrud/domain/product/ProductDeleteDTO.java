package com.example.javacrud.domain.product;

import jakarta.validation.constraints.NotNull;

public record ProductDeleteDTO(@NotNull String id) {
}
