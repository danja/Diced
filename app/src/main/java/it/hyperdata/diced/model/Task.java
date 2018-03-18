package it.hyperdata.diced.model;

import java.time.LocalDateTime;
import java.util.List;
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
     * parent in hierarchy
     *
     * @return the parent
     */
    public Task getParent();

    /**
     * parent in hierarchy
     *
     * @param parent the parent
     */
    public void setParent(Task parent);

    public void addChild(Task task);

    public void removeChild(Task task);

    public List<Task> getChildren();

    public boolean isRoot();

    public void setRoot(boolean isRoot);

    /**
     * position of this task amongst its siblings
     *
     * @return the index
     */
    public char getIndex();

    /**
     * position of this task amongst its siblings
     *
     * @param index the index
     */
    public void setIndex(char index);

    /**
     * when this task was created
     *
     * @return creation datetime
     */
    public LocalDateTime getCreatedDate();

    /**
     * when this task was created
     *
     * @param createdDate creation datetime
     */
    public void setCreatedDate(LocalDateTime createdDate);

    /**
     * when this task was completed
     *
     * @return completion datetime
     */
    public LocalDateTime getClosedDate();

    /**
     * when this task was completed
     *
     * @param closedDate completion datetime
     */
    public void setClosedDate(LocalDateTime closedDate);

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
     * the date/time at which this task was put on hold
     *
     * @return the date/time
     */
    public LocalDateTime getHeldDate();

    /**
     * the date/time at which this task was put on hold
     *
     * @param heldDate the date/time
     */
    public void setHeldDate(LocalDateTime heldDate);

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

    public String toTestString();
}
