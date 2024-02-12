package com.salles.todolist.controller;

import com.salles.todolist.entity.Todo;
import com.salles.todolist.entity.TodoRequestDTO;
import com.salles.todolist.entity.TodoResponseDTO;
import com.salles.todolist.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @PutMapping
    public ResponseEntity<?> updateTask(@RequestBody TodoRequestDTO data) {
        Optional<Todo> optTodo = repository.findById(data.id());
        if (optTodo.isPresent()) {
            Todo todo = optTodo.get();
            if (data.name() != null)
                todo.setName(data.name());
            if (data.description() != null)
                todo.setDescription(data.description());
            if (data.accomplished() != null)
                todo.setAccomplished(data.accomplished());
            if (data.priority() != null)
                todo.setPriority(data.priority());
            repository.save(todo);
            return ResponseEntity.ok(todo);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping
    public ResponseEntity<?> deleteTask(@RequestBody TodoRequestDTO data) {
        Optional<Todo> optTodo = repository.findById(data.id());
        if (optTodo.isPresent()) {
            repository.deleteById(data.id());
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
