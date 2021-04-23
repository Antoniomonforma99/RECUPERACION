package com.salesianostriana.dam.todolist.controller;

import com.salesianostriana.dam.todolist.model.Task;
import com.salesianostriana.dam.todolist.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class TaskController {

    @Autowired
    private TaskService service;

    @GetMapping("/")
    public String listAll(Model model) {

        model.addAttribute("tasks", service.findAll());

        return "index"; // /src/main/resources/templates/index.html
    }

    @GetMapping("/task/{id}")
    public String viewTask(Model model, long id){
        
    }

    @GetMapping("/task/new")
    public String newTaskForm(Model model) {
        model.addAttribute("task", new Task());
        return "form";
    }

    @PostMapping("task/new/submit")
    public String newTaskSubmit(@ModelAttribute("task") Task newTask) {
        service.add(newTask);
        return "redirect:/";
    }

    @GetMapping("/task/edit/{id}")
    public String editTaskForm(@PathVariable long id, Model model) {
        Optional<Task> optionalTask = service.findById(id);
        if (optionalTask.isPresent()) {
            model.addAttribute("task", optionalTask.get());
            return "form";
        } else {
            return "redirect:/";
        }
    }

    @PostMapping("task/edit/submit")
    public String editTaskSubmit(@ModelAttribute("taskForm") Task task,
        BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "editForm";
        } else {
            service.edit(task);
            return "redirect:/";
        }
    }

    @GetMapping("/task/delete/{id}")
    public String deleteTask(@PathVariable("id") long id) {
        service.deleteById(id);
        return "redirect:/";
    }






}
