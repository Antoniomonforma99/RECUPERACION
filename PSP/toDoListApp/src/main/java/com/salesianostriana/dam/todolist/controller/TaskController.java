package com.salesianostriana.dam.todolist.controller;

import com.salesianostriana.dam.todolist.model.Task;
import com.salesianostriana.dam.todolist.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;

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

    @GetMapping("/task/new")
    public String newTaskForm(Model model) {
        model.addAttribute("taskForm", new Task());
        return "form";
    }

    @PostMapping("task/new/submit")
    public String newTaskSubmit(@ModelAttribute("taskForm") Task newTask) {
        newTask.setFechaCreacion(LocalDate.now());
        newTask.setFechaCaducidad(LocalDate.now());
        service.add(newTask);
        return "redirect:/";
    }

    @GetMapping("/task/edit/{id}")
    public String editTaskForm(@PathVariable("id")long id, Model model) {
        Task task = service.findById(id);
        if (task != null) {
            model.addAttribute("taskForm", task);
            return "editForm";
        }else{
            return "redirect:/task/new";
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
    public String deleteTask(@PathVariable("id") long id, Model model) {
        Task task = service.findById(id);
        if (task != null) {
            service.delete(task);
        }
        return "redirect:/";
    }






}
