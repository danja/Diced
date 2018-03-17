package it.hyperdata.diced.model.simple;

import java.util.HashSet;
import java.util.Set;

import it.hyperdata.diced.model.Task;
import it.hyperdata.diced.model.TaskTree;

/**
 * Simple object representation of a {TaskTree}
 * <p>
 * Created by danny on 06/03/18.
 */

public class TaskTreeBase implements TaskTree {

    private String name;

    private Set<Task> tasks;

    public TaskTreeBase(String name) {
        this.name = name;
        tasks = new HashSet<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
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
