package com.example.todo.dto;

import jakarta.validation.constraints.NotBlank;

public class TodoDto {
    private Long id;

    @NotBlank(message = "Title is required")
    private String title;

    private String description;
    private  boolean completed;


}
