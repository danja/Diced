package it.hyperdata.diced.model;

import java.time.LocalDateTime;
import java.util.Set;

/**
 * Represents an action that an agent wishes to carry out (or has carried out)
 * <p>
 * Created by danny on 06/03/18.
 */

public interface Task {

    /**
     * unique identifier for the Task
     *
     * @return the id
     */
    public String getId();

    /**
     * unique identifier for the Task
     *
     * @param id the id
     */
    public void setId(String id);

    /**
     * the agent responsible for creating this task
     *
     * @return the agent
     */
    public Agent getCreator();

    /**
     * the agent responsible for creating this task
     *
     * @param creator the agent
     */
    public void setCreator(Agent creator);

    /**
     * the name of this task
     *
     * @return the name
     */
    public String getTitle();

    /**
     * the name of this task
     *
     * @param title the name
     */
    public void setTitle(String title);

    /**
     * a text description of this task
     *
     * @return the text
     */
    public String getDescription();

    /**
     * a text description of this task
     *
     * @param description the text
     */
    public void setDescription(String description);

    /**
     * the date/time at which this task was created
     *
     * @return the date/time
     */
    public LocalDateTime getCreated();

    /**
     * the date/time at which this task was created
     *
     * @param createDate the date/time
     */
    public void setCreated(LocalDateTime createDate);

    /**
     * the date/time at which this task was completed
     *
     * @return the date/time
     */
    public LocalDateTime getDone();

    /**
     * the date/time at which this task was completed
     *
     * @param doneDate the date/time
     */
    public void setDone(LocalDateTime doneDate);

    /**
     * the date/time at which this task was put on hold
     *
     * @return the date/time
     */
    public LocalDateTime getHeld();

    /**
     * the date/time at which this task was put on hold
     *
     * @param held the date/time
     */
    public void setHeld(LocalDateTime held);

    /**
     * where this task is in its lifecycle
     *
     * @return the status
     */
    public Status getStatus();

    /**
     * where this task is in its lifecycle
     *
     * @param status the status
     */
    public void setStatus(Status status);

    /**
     * labels/keywords associated with this task
     *
     * @return the tags
     */
    public Set<String> getTags();

    /**
     * labels/keywords associated with this task
     *
     * @param tags the tags
     */
    public void setTags(Set<String> tags);

    /**
     * @param tag a label/keyword to associate with this task
     */
    public void addTag(String tag);

    /**
     * remove association between this task and given label/keyword
     *
     * @param tag the keyword
     */
    public void removeTag(String tag);


}
