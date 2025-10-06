package com.example.todo.model;

import jarkata.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name= "todos")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false)
    private String title;

    @Column(length = 2000)
    private String description;

    @Column(nullable = false)
    private boolean completed = false;


    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @PrePersist
    protected void onCreate(){
        createdAt = LocalDateTime.now();
        updatedAt = createdAt;
    }

    @PreUpdate
    protected void onUpdate(){
        updatedAt = LocalDateTime.now();
    }

    public Todo(){}
    public Todo(String title, String description){
        this.title = title;
        this.description = description;
    }
    
}
