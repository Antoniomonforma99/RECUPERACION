package com.salesianos.triana.antonio.toDoListApp.dto;


import javax.persistence.Column;
import java.util.Date;

public class ToDoDTO {

    private long id;
    private String title;
    private String content;
    private boolean done;
    private Date fecha;
}
