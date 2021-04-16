package com.salesianos.triana.antonio.toDoListApp.repo;

import com.salesianos.triana.antonio.toDoListApp.model.ToDoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepo extends JpaRepository<ToDoItem, Long> {
}
