package com.salesianostriana.dam.todolist.service;

import com.salesianostriana.dam.todolist.model.Task;

import java.util.List;
import java.util.Optional;

public interface TaskService {

    public Task add(Task t);
    public List<Task> findAll();
    public Optional<Task> findById(long id);
    public Task edit(Task t);
    public void deleteById(long id);
}
