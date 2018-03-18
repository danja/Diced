package it.hyperdata.diced.model.simple;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
    private Task parent;
    private List<Task> children = new ArrayList();
    private char index;
    private Agent creator;
    private String title;
    private String description;
    private LocalDateTime createDate;
    private LocalDateTime closedDate;
    private LocalDateTime heldDate;
    private Status status;
    private Set<String> tags = new HashSet<>();
    private boolean isRoot = false;

    @Override
    public char getIndex() {
        return this.index;
    }

    @Override
    public void setIndex(char index) {
        this.index = index;
    }

    @Override
    public LocalDateTime getCreatedDate() {
        return this.createDate;
    }

    @Override
    public void setCreatedDate(LocalDateTime createdDate) {
        this.createDate = createdDate;
    }

    @Override
    public LocalDateTime getClosedDate() {
        return this.closedDate;
    }

    @Override
    public void setClosedDate(LocalDateTime closedDate) {
        this.closedDate = closedDate;
    }

    @Override
    public Task getParent() {
        return this.parent;
    }

    @Override
    public void setParent(Task parent) {
        this.parent = parent;
    }

    @Override
    public void addChild(Task task) {
        this.children.add(task);
    }

    @Override
    public void removeChild(Task task) {
        this.children.remove(task);
    }

    @Override
    public List<Task> getChildren() {
        return this.children;
    }

    @Override
    public boolean isRoot() {
        return this.isRoot;
    }

    @Override
    public void setRoot(boolean isRoot) {
        this.isRoot = isRoot;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Agent getCreator() {
        return this.creator;
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
        return this.title;
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
        return this.description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public LocalDateTime getCreated() {
        return this.createDate;
    }

    @Override
    public void setCreated(LocalDateTime createDate) {
        this.createDate = createDate;
    }


    @Override
    public LocalDateTime getHeldDate() {
        return this.heldDate;
    }

    @Override
    public void setHeldDate(LocalDateTime heldDate) {
        this.heldDate = heldDate;
    }

    @Override
    public Status getStatus() {
        return this.status;
    }

    @Override
    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public Set<String> getTags() {
        return this.tags;
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

    /**
     * id, parent id, child1, child2, child3...
     * <p>
     * generate a string version covering tree structure
     *
     * @return string version
     */
    @Override
    public String toTestString() {
        String string = "task: " + getId() + ", ";
        if (getParent() != null) {
            string += "parent: " + getParent().getId() + ", ";
        }
        string += "children: ";
        for (Task task : getChildren()) {
            string = string + task.getId() + " ";
        }
        return string;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }
}
