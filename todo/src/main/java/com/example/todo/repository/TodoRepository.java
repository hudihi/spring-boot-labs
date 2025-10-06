package com.example.todo.repository;

import com.example.todo.model.Todo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    Page<Todo> findByTitleContainingIgnoreCase(String title, Pageable pageable);
    Page<Todo> findByCompleted(boolean completed, Pageable pageable);
}
