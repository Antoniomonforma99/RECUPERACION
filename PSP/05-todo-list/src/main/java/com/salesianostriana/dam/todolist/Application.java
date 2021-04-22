package com.salesianostriana.dam.todolist;

import com.salesianostriana.dam.todolist.model.Task;
import com.salesianostriana.dam.todolist.model.TaskRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


	@Bean
	public CommandLineRunner init(TaskRepository repository) {
		return args -> {


			List<Task> tareas = List.of(
					new Task("Venir a clase el Lunes","Hola", LocalDate.now()),
					new Task("Hacer el ejercicio DEB02","Hola", LocalDate.now().minusDays(3)),
					new Task("Primera tarea", "Hola",LocalDate.now()),
					new Task("Segunda tarea", "Hola",LocalDate.now()),
					new Task("Tercera tarea", "Hola",LocalDate.now()),
					new Task("Cuarta tarea", "Hola",LocalDate.now())

			);

			repository.saveAll(tareas);



		};
	}



}
