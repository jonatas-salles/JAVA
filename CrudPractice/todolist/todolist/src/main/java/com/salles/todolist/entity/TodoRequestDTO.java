package com.salles.todolist.entity;

public record TodoRequestDTO(Long id, String name, String description, Boolean accomplished, Integer priority) {
}
