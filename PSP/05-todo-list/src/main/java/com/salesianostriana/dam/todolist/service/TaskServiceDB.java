package com.salesianostriana.dam.todolist.service;

import com.salesianostriana.dam.todolist.model.Task;
import com.salesianostriana.dam.todolist.model.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public Task findById(long id) {
        return null;
    }

    @Override
    public Task edit(Task t) {
        return null;
    }
}
