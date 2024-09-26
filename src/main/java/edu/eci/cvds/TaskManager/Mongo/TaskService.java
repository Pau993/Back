package edu.eci.cvds.TaskManager.Mongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Service
@RequestMapping("/api/tasks")
public class TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    @PostMapping
    public void addTask(Task task) {
        taskRepository.addTask(task);
    }
    @PutMapping
    public void completeTask(String taskId) {
        taskRepository.completeTask(taskId);
    }
    @DeleteMapping
    public void deleteTask(String taskId) {
        taskRepository.deleteTask(taskId);
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return taskRepository.getAllTasks();
    }
}

