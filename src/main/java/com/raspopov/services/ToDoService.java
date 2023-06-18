package com.raspopov.services;

import com.raspopov.domain.ToDo;
import com.raspopov.repositories.ToDoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ToDoService {
    private final ToDoRepository toDoRepository;

    public ToDo create(ToDo toDo) {
        if (toDo.getId() != null)
            throw new IllegalArgumentException("Entity Id must be null");
        return toDoRepository.save(toDo);
    }

    public List<ToDo> get() {
        return toDoRepository.findAll();
    }

    public ToDo get(Long id) {
        return toDoRepository.findById(id).orElseThrow();
    }
}
