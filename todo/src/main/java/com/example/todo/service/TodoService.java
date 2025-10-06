package com.example.todo.service;

import com.example.todo.dto.TodoDto;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;

public interface TodoService {
    TodoDto create(TodoDto dto);
    TodoDto getById(Long id);
    Page<TodoDto> getAll(Pageable pageable);
    TodoDto update(Long id, TodoDto dto);
    void delete(Long id);
}
