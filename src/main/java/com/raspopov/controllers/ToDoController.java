package com.raspopov.controllers;

import com.raspopov.domain.ToDo;
import com.raspopov.services.ToDoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/todo")
@RequiredArgsConstructor
public class ToDoController {
    private final ToDoService toDoService;

    @PostMapping
    public ToDo create(@RequestBody ToDo toDo) {
        return toDoService.create(toDo);
    }

    @GetMapping
    public List<ToDo> getAll() {
        return toDoService.get();
    }

    @GetMapping("/{id}")
    public ToDo get(@PathVariable Long id) {
        return toDoService.get(id);
    }
}
