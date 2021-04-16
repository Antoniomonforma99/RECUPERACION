package com.salesianos.triana.antonio.toDoListApp.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class ToDoItem {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    @Column
    private String title;
    @Column
    private String content;
    @Column
    private boolean done;
    private Date fecha;

    public ToDoItem(long id, String title, String content, boolean done, Date fecha) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.done = done;
        this.fecha = fecha;
    }

    public ToDoItem() {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
