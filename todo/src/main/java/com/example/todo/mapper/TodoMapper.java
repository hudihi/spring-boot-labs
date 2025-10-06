package com.example.todo.mapper;

import com.example.todo.dto.TodoDto;
import com.example.todo.model.Todo;

public class TodoMapper {

    public static TodoDto toDto(Todo t){
        TodoDto d = new TodoDto();
        d.setId(t.getId());
        d.setTitle(t.getTitle());
        d.setDescription(t.getDescription());
        d.setCompleted(t.isCompleted());

        return d;
    }

    public static Todo toEntity(TodoDto d){
        Todo t = new Todo();
        t.setTitle(d.getTitle());
        t.setDescription(d.getDescription());
        t.setCompleted(d.isCompleted());
        return t;
    }

    public static void updateEntity(TodoDto d, Todo t){
        if(d.getTitle() != null) t.setTitle(d.getTitle());
        t.setDescription(d.getDescription());
        t.setCompleted(d.isCompleted());
    }
}
