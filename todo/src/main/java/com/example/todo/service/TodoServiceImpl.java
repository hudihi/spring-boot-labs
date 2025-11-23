package com.example.todo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.todo.dto.TodoDto;
import com.example.todo.exception.TodoNotFoundException;
import com.example.todo.mapper.TodoMapper;
import com.example.todo.model.Todo;
import com.example.todo.repository.TodoRepository;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService{


    private final TodoRepository repository;
    private final TodoMapper mapper;


    @Override
    public TodoDto create(TodoDto dto){
        Todo todo = mapper.toEntity(dto);
        Todo savedItem = repository.save(todo);
        return mapper.toDto(savedItem);
    }

    @Override
    public TodoDto getById(Long id){
        Todo todo = repository.findById(id).orElseThrow(() -> new TodoNotFoundException("Todo not found with id" + id));
        return mapper.toDto(todo);
    }


    @Override
    public Page<TodoDto> getAll(Pageable pageable){
        Page<TodoDto> todos = repository.findAll(pageable).map(mapper::toDto);
        return todos;
    }

    @Override
    public TodoDto update(Long id, TodoDto dto){
        Todo todo = repository.findById(id).orElseThrow(() -> new TodoNotFoundException("Todo not found with id" + id));
        mapper.updateEntity(dto, todo);
        Todo updatedItem = repository.save(todo);
        return mapper.toDto(updatedItem);
    }



    @Override
    public void delete(Long id) {
        Todo todo = repository.findById(id).orElseThrow(() -> new TodoNotFoundException("Todo not found with id" + id));
        repository.delete(todo);
    }
}