package com.example.todolist.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private boolean isComplete;

    public Todo() {
    }

    public Todo(Long id, String title, boolean isComplete) {
        this.id = id;
        this.title = title;
        this.isComplete = isComplete;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public boolean isComplete() {
        return isComplete;
    }
    
    public void setComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }
}