package com.salles.todolist.entity;

public record TodoResponseDTO(Long id, String name, String description, Boolean accomplished, Integer priority) {
    public TodoResponseDTO(Todo todo) {
        this(todo.getId(), todo.getName(), todo.getDescription(), todo.getAccomplished(), todo.getPriority());
    }
}
