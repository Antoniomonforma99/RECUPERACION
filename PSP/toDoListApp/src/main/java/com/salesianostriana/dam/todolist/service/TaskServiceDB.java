package com.salesianostriana.dam.todolist.service;

import com.salesianostriana.dam.todolist.model.Task;
import com.salesianostriana.dam.todolist.model.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Primary
@Service("taskServiceDB")
public class TaskServiceDB implements TaskService {

    @Autowired
    private TaskRepository repository;

    @Override
    public Task add(Task t) {
        return repository.save(t);
    }

    @Override
    public List<Task> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Task> findById(long id) {
        return repository.findById(id);
    }

    @Override
    public Task edit(Task t) {
        return null;
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }
}
