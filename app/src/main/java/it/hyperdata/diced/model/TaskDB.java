package it.hyperdata.diced.model;

import java.util.Set;

/**
 * A container for tasks.
 * <p>
 * Created by danny on 06/03/18.
 */

public interface TaskDB {

    /**
     * add a task to this container
     *
     * @param task the task to add
     */
    public void addTask(Task task);

    /**
     * remove a task from this container
     *
     * @param task the task to remove
     */
    public void removeTask(Task task);

    /**
     * retrieve all the tasks in this container
     *
     * @return the tasks
     */
    public Set<Task> getTasks();
}
