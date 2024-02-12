package com.salles.todolist.controller;

import com.salles.todolist.entity.TodoResponseDTO;
import com.salles.todolist.repository.TodoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class TodoController {
    private final TodoRepository repository;

    public TodoController(TodoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public ResponseEntity<?> listAll() {
        List<TodoResponseDTO> todos = repository.findAll().stream().map(TodoResponseDTO::new).toList();
        return ResponseEntity.ok(todos);
    }
}
