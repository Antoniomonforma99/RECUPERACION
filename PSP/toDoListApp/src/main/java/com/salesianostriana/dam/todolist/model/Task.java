package com.salesianostriana.dam.todolist.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.jni.Local;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
public class Task {

    @Id @GeneratedValue
    private long id;

    private String nombre;



    private String descripcion;

    private LocalDate fechaCreacion;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaCaducidad;

    public Task(String nombre,String descripcion, LocalDate fechaCaducidad) {
        this.nombre = nombre;
        this.fechaCreacion = LocalDate.now();
        this.descripcion = descripcion;
        this.fechaCaducidad = fechaCaducidad;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

}
