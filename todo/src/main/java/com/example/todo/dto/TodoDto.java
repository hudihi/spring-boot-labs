package com.example.todo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TodoDto {

    @JsonProperty("item_id")
    private Long id;

    @NotBlank(message = "Title is required")
    private String title;

    @Size(max = 2000, message = "Description must be less than 2000 characters")
    @NotBlank(message = "Description is required")
    private String description;

    @JsonProperty("is_completed")
    private boolean completed;


    
}