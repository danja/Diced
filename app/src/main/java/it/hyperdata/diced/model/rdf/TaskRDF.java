package it.hyperdata.diced.model.rdf;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import it.hyperdata.diced.model.Agent;
import it.hyperdata.diced.model.Status;
import it.hyperdata.diced.model.Task;

/**
 * Created by danny on 17/03/18.
 */

public class TaskRDF implements Task {

    private Resource taskResource;
    private Model model;

    public TaskRDF(String uri) {
        model = ModelFactory.createDefaultModel();
        taskResource = model.createResource(uri);
    }

    /**
     * unique identifier for the Task
     *
     * @return the id
     */
    @Override
    public String getId() {
        return taskResource.getURI();
    }

    /**
     * replaces uri - shouldn't be needed
     * <p>
     * unique identifier for the Task
     *
     * @param id the id
     */
    @Override
    public void setId(String id) {
        // TODO
    }

    /**
     * parent in hierarchy
     *
     * @return the parent
     */
    @Override
    public Task getParent() {
        return null;
    } // TODO

    /**
     * parent in hierarchy
     *
     * @param parent the parent
     */
    @Override
    public void setParent(Task parent) { // TODO

    }

    @Override
    public void addChild(Task task) { // TODO

    }

    @Override
    public void removeChild(Task task) { // TODO

    }

    @Override
    public List<Task> getChildren() { // TODO
        return null;
    }

    @Override
    public boolean isRoot() { // TODO
        return false;
    }

    @Override
    public void setRoot(boolean isRoot) { // TODO

    }

    /**
     * position of this task amongst its siblings
     *
     * @return the index
     */
    @Override
    public char getIndex() {
        return 0;
    } // TODO

    /**
     * position of this task amongst its siblings
     *
     * @param index the index
     */
    @Override
    public void setIndex(char index) { // TODO

    }

    /**
     * when this task was created
     *
     * @return creation datetime
     */
    @Override
    public LocalDateTime getCreatedDate() {
        return null;
    }

    /**
     * when this task was created
     *
     * @param createdDate creation datetime
     */
    @Override
    public void setCreatedDate(LocalDateTime createdDate) {

    }

    /**
     * when this task was completed
     *
     * @return completion datetime
     */
    @Override
    public LocalDateTime getClosedDate() {
        return null;
    }

    /**
     * when this task was completed
     *
     * @param closedDate completion datetime
     */
    @Override
    public void setClosedDate(LocalDateTime closedDate) {

    }

    /**
     * the agent responsible for creating this task
     *
     * @return the agent
     */
    @Override
    public Agent getCreator() {
        return null;
    }

    /**
     * the agent responsible for creating this task
     *
     * @param creator the agent
     */
    @Override
    public void setCreator(Agent creator) {

    }

    /**
     * the name of this task
     *
     * @return the name
     */
    @Override
    public String getTitle() {
        return null;
    }

    /**
     * the name of this task
     *
     * @param title the name
     */
    @Override
    public void setTitle(String title) {

    }

    /**
     * a text description of this task
     *
     * @return the text
     */
    @Override
    public String getDescription() {
        return null;
    }

    /**
     * a text description of this task
     *
     * @param description the text
     */
    @Override
    public void setDescription(String description) {

    }

    /**
     * the date/time at which this task was created
     *
     * @return the date/time
     */
    @Override
    public LocalDateTime getCreated() {
        return null;
    }

    /**
     * the date/time at which this task was created
     *
     * @param createDate the date/time
     */
    @Override
    public void setCreated(LocalDateTime createDate) {

    }

    /**
     * the date/time at which this task was put on hold
     *
     * @return the date/time
     */
    @Override
    public LocalDateTime getHeldDate() {
        return null;
    }

    /**
     * the date/time at which this task was put on hold
     *
     * @param heldDate the date/time
     */
    @Override
    public void setHeldDate(LocalDateTime heldDate) {

    }

    /**
     * where this task is in its lifecycle
     *
     * @return the status
     */
    @Override
    public Status getStatus() {
        return null;
    }

    /**
     * where this task is in its lifecycle
     *
     * @param status the status
     */
    @Override
    public void setStatus(Status status) {

    }

    /**
     * labels/keywords associated with this task
     *
     * @return the tags
     */
    @Override
    public Set<String> getTags() {
        return null;
    }

    /**
     * labels/keywords associated with this task
     *
     * @param tags the tags
     */
    @Override
    public void setTags(Set<String> tags) {

    }

    /**
     * @param tag a label/keyword to associate with this task
     */
    @Override
    public void addTag(String tag) {

    }

    /**
     * remove association between this task and given label/keyword
     *
     * @param tag the keyword
     */
    @Override
    public void removeTag(String tag) {

    }

    @Override
    public String toTestString() {
        return null;
    }
}
