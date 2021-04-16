package com.salesianos.triana.antonio.toDoListApp.controller;

import com.salesianos.triana.antonio.toDoListApp.model.ToDoItem;
import com.salesianos.triana.antonio.toDoListApp.repo.ToDoRepo;
import com.salesianos.triana.antonio.toDoListApp.service.ToDoService;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
public class ToDoController {

    private final ToDoService toDoService;

    @Autowired
    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }


}
