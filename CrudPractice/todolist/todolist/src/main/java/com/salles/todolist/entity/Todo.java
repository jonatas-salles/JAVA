package com.salles.todolist.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "todo")
@Table(name = "todo")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Getter
@Setter
public class Todo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Boolean accomplished;
    private int priority;

    public Todo(TodoRequestDTO data) {
        this.name = data.name();
        this.description = data.description();
        this.accomplished = data.accomplished();
        this.priority = data.priority();
    }
}
