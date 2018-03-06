package it.hyperdata.diced.model.simple;

import java.util.HashSet;
import java.util.Set;

import it.hyperdata.diced.model.Task;
import it.hyperdata.diced.model.TaskDB;

/**
 * Simple object representation of a {TaskDB}
 * <p>
 * Created by danny on 06/03/18.
 */

public class TaskDBBase implements TaskDB {

    private static final TaskDBBase instance = new TaskDBBase();
    private Set<Task> tasks = new HashSet<>();

    private TaskDBBase() {
    }

    public static TaskDBBase getInstance() {
        return instance;
    }

    @Override
    public void addTask(Task task) {
        this.tasks.add(task);
    }

    @Override
    public void removeTask(Task task) {
        this.tasks.remove(task);
    }

    @Override
    public Set<Task> getTasks() {
        return this.tasks;
    }
}
