package edu.eci.cvds.TaskManager.Mongo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class FileTaskRepository implements TaskRepository {

    private final String filePath = "tasks.txt";

    @Override
    public void addTask(Task task) { // Implementando correctamente el método addTask
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write(task.toString() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void completeTask(String taskId) {
        // Implementación para marcar una tarea como completada en el archivo de texto
    }

    @Override
    public void deleteTask(String taskId) {
        // Implementación para eliminar una tarea del archivo de texto
    }

    @Override
    public List<Task> getAllTasks() { // Implementando correctamente el método getAllTasks
        List<Task> tasks = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                tasks.add(parseTask(line)); // parseTask() convierte el String en una instancia de Task
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tasks;
    }

    private Task parseTask(String line) {
        // Convierte una línea del archivo en un objeto Task
        return new Task(); // Proporciona una implementación real de esto
    }

}

