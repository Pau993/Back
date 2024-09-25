package edu.eci.cvds.TaskManager.Mongo;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class MongoTaskRepository implements TaskRepository {

    @Override
    public void addTask(Task task) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addTask'");
    }

    @Override
    public void completeTask(String taskId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'completeTask'");
    }

    @Override
    public void deleteTask(String taskId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteTask'");
    }

    @Override
    public List<Task> getAllTasks() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllTasks'");
    }

}
