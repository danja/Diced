package it.hyperdata.diced.model.simple;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import it.hyperdata.diced.model.Agent;
import it.hyperdata.diced.model.Status;
import it.hyperdata.diced.model.Task;

/**
 * Simple object representation of a {Task}
 * <p>
 * Created by danny on 06/03/18.
 */

public class TaskBase implements Task {

    private String id;
    private Agent creator;
    private String title;
    private String description;
    private LocalDateTime createDate;
    private LocalDateTime doneDate;
    private LocalDateTime held;
    private Status status;
    private Set<String> tags = new HashSet<>();

    /**
     * {@inheritDoc}
     */
    @Override
    public Agent getCreator() {
        return creator;
    }

    @Override
    public void setCreator(Agent creator) {
        this.creator = creator;
    }

    /**
     * @return
     */
    @Override
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public LocalDateTime getCreated() {
        return createDate;
    }

    @Override
    public void setCreated(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    @Override
    public LocalDateTime getDone() {
        return doneDate;
    }

    @Override
    public void setDone(LocalDateTime doneDate) {
        this.doneDate = doneDate;
    }

    @Override
    public LocalDateTime getHeld() {
        return held;
    }

    @Override
    public void setHeld(LocalDateTime held) {
        this.held = held;
    }

    @Override
    public Status getStatus() {
        return status;
    }

    @Override
    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public Set<String> getTags() {
        return tags;
    }

    @Override
    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    @Override
    public void addTag(String tag) {
        this.tags.add(tag);
    }

    @Override
    public void removeTag(String tag) {
        this.tags.remove(tag);
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }
}
