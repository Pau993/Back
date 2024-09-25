package edu.eci.cvds.TaskManager.Mongo;

import jakarta.persistence.Id;

@Document(collection = "tasks")
public class Task {
    @Id
    private String id;
    private String description;
    private boolean completed;

    // Getters y Setters
}