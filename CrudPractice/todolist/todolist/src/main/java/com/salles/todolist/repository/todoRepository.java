package com.salles.todolist.repository;

import com.salles.todolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface todoRepository extends JpaRepository<Todo, Long> {
}
