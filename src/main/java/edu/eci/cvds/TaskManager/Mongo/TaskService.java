package edu.eci.cvds.TaskManager.Mongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public void addTask(Task task) {
        taskRepository.addTask(task);
    }

    public void completeTask(String taskId) {
        taskRepository.completeTask(taskId);
    }

    public void deleteTask(String taskId) {
        taskRepository.deleteTask(taskId);
    }

    public List<Task> getAllTasks() {
        return taskRepository.getAllTasks();
    }
}

