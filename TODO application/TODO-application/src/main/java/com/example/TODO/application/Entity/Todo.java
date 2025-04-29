package com.example.TODO.application.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "todotable")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String taskContent;

    private boolean completionStatus; // To track whether the task is done or not

    // Default constructor
    public Todo() {

    }

    // Constructor for creating a Todo with task content
    public Todo(String taskContent) {
        this.taskContent = taskContent;
        this.completionStatus = false; // Defaults to "not done"
    }

    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTaskContent() {
        return taskContent;
    }

    public void setTaskContent(String taskContent) {
        this.taskContent = taskContent;
    }

    public boolean isCompletionStatus() {
        return completionStatus;
    }

    public void setCompletionStatus(boolean completionStatus) {
        this.completionStatus = completionStatus;
    }
}
