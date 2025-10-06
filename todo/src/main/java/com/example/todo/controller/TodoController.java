package com.example.todo.controller;


import com.example.todo.dto.TodoDto;
import com.example.todo.service.TodoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/todos")
public class TodoController {
    @Autowired
    private TodoService service;

    @PostMapping
    public ResponseEntity<TodoDto> create(@Valid @RequestBody TodoDto dto){
        TodoDto created = service.create(dto);
        return ResponseEntity.status(201).body(created);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TodoDto> getById(@PathVariable Long id){
        return ResponseEntity.ok(service.getById(id));
    }

    @GetMapping
    public ResponseEntity<Page<TodoDto>> list(Pageable pageable){
        return ResponseEntity.ok(service.getAll(pageable))
    }

    @PutMapping("/{id}")
    public ResponseEntity<TodoDto> update(@PathVariable Long id, @Valid @RequestBody TodoDto dto){
        return ResponseEntity.ok(service.update(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
