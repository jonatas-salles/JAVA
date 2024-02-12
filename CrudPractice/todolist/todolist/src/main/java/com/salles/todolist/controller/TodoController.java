package com.salles.todolist.controller;

import com.salles.todolist.entity.Todo;
import com.salles.todolist.entity.TodoRequestDTO;
import com.salles.todolist.entity.TodoResponseDTO;
import com.salles.todolist.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class TodoController {
    @Autowired
    private TodoRepository repository;

    @GetMapping
    public ResponseEntity<?> listAll() {
        List<TodoResponseDTO> todos = repository.findAll().stream().map(TodoResponseDTO::new).toList();
        return ResponseEntity.ok(todos);
    }

    @PostMapping
    public ResponseEntity<?> saveTask(@RequestBody TodoRequestDTO data) {
        Todo todo = new Todo(data);
        repository.save(todo);
        return ResponseEntity.ok(todo);
    }
}
