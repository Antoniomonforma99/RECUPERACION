package com.salesianostriana.dam.todolist.controller;

import com.salesianostriana.dam.todolist.model.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor

public class MainController {
    /*
    @Autowired
    private TaskService service;

    private final TaskRepository repository;
    /*
    @GetMapping("/")
    public String listAll(Model model) {

        model.addAttribute("tasks", service.findAll());

        return "index"; // /src/main/resources/templates/index.html
    }
     */




    /*
    @GetMapping("/new")
    public String newTask(Model model) {
        model.addAttribute("task", new Task());
    }


     */

}
