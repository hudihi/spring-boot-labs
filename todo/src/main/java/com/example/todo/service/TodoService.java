package com.example.todo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.todo.dto.TodoDto;

public interface TodoService {
    TodoDto create(TodoDto dto);
    TodoDto getById(Long id);
    Page<TodoDto> getAll(Pageable pageable);
    TodoDto update(Long id, TodoDto dto);
    void delete(Long id);
}
