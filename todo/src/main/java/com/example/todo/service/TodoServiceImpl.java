package com.example.todo.service;

import com.example.todo.dto.TodoDto;
import com.example.todo.mapper.TodoMapper;
import com.example.todo.model.Todo;
import com.example.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Transactional;

import java.awt.print.Pageable;

public class TodoServiceImpl implements  TodoService{

    @Autowired
    private TodoRepository repo;

    @Override
    @Transactional
    public TodoDto create(TodoDto dto) {
        Todo entity = TodoMapper.toEntity(dto);
        Todo saved = repo.save(entity);
        return TodoMapper.toDto(saved);
    }

    @Override
    public TodoDto getById(Long id) {
        Todo t = repo.findById(id).orElseThrow(()-> new ResourceNotFoundexception("Todo not found"));
        return TodoMapper.toDto(t);
    }

    @Override
    public Page<TodoDto> getAll(Pageable pageable) {
        return repo.findAll(pageable).map(TodoMapper::toDto);
    }

    @Override
    @Transactional
    public TodoDto update(Long id, TodoDto dto) {
        Todo t = repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Todo not found"));
        TodoMapper.updateEntity(dto, t);
        return TodoMapper.toDto(repo.save(t));
    }

    @Override
    @Transactional
    public void delete(Long id) {
        if(!repo.existsById(id)) throw new ResourceNotFoundException("Todo not found");
        repo.deleteById(id);
    }
}
