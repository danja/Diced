package it.hyperdata.diced.model;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import it.hyperdata.diced.model.simple.TaskBase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by danny on 07/03/18.
 */
@RunWith(Parameterized.class)
public class TaskTest {

    Task task;

    String ID;
    String PARENT;
    char INDEX;
    LocalDateTime CREATED;
    LocalDateTime HELD;
    LocalDateTime CLOSED;
    Set<String> TAGS;
    String NEW_TAG;
    String OLD_TAG;
    String TITLE;
    String DESCRIPTION;
    Status STATUS_OPEN;
    String STATUS_OPEN_STRING;
    Status STATUS_HELD;
    Status STATUS_CLOSED;

    public TaskTest(Task task) {
        this.task = task;
    }

    @Parameterized.Parameters
    public static Collection tasks() {
        return Arrays.asList(new Object[][]{
                {new TaskBase()},
                {new TaskBase()} // TODO replace this with RDF version
        });
    }

    @Before
    public void setUp() throws Exception {
        // task = new TaskBase();

        ID = "http://test";
        TITLE = "a task";
        DESCRIPTION = "a dummy task";
        STATUS_OPEN = Status.OPEN;
        STATUS_HELD = Status.HELD;
        STATUS_CLOSED = Status.CLOSED;
        STATUS_OPEN_STRING = "Open";
        TAGS = new HashSet<>(Arrays.asList("one", "two", "three"));
        NEW_TAG = "four";
        OLD_TAG = "two";
        PARENT = "http://parent";
        INDEX = 42;
        CREATED = LocalDateTime.now();
        long offset = 3;
        HELD = CREATED.plusDays(offset);
        CLOSED = HELD.plusDays(offset);
    }

    @Test
    public void testSetGetId() throws Exception {
        task.setId(ID);
        assertEquals(ID, task.getId());
    }

    @Test
    public void testSetGetParent() throws Exception {
        task.setParent(PARENT);
        assertEquals(PARENT, task.getParent());
    }

    @Test
    public void testSetGetIndex() throws Exception {
        task.setIndex(INDEX);
        assertEquals(INDEX, task.getIndex());
    }

    @Test
    public void testSetGetCreateDate() throws Exception {
        task.setCreatedDate(CREATED);
        assertEquals(CREATED, task.getCreatedDate());
    }

    @Test
    public void testSetGetHeldDate() throws Exception {
        task.setHeldDate(HELD);
        assertEquals(HELD, task.getHeldDate());
    }

    @Test
    public void testSetGetClosedDate() throws Exception {
        task.setClosedDate(CLOSED);
        assertEquals(CLOSED, task.getClosedDate());
    }

    @Test
    public void testSetGetTitle() throws Exception {
        task.setTitle(TITLE);
        assertEquals(TITLE, task.getTitle());
    }

    @Test
    public void testSetGetDescription() throws Exception {
        task.setDescription(DESCRIPTION);
        assertEquals(DESCRIPTION, task.getDescription());
    }

    @Test
    public void testSetGetCreator() throws Exception {
        // TODO
        throw new Exception();
    }

    @Test
    public void testStatus() throws Exception {
        Status status = Status.OPEN;
        task.setStatus(status);
        assertEquals(STATUS_OPEN_STRING, task.getStatus().asString());
    }

    @Test
    public void testTags() throws Exception {
        task.setTags(TAGS);
        assertEquals(TAGS, task.getTags());
        task.addTag(NEW_TAG);
        assertEquals(4, task.getTags().size());
        assertTrue(task.getTags().contains(NEW_TAG));
        task.removeTag(OLD_TAG);
        assertFalse(task.getTags().contains(OLD_TAG));
        assertEquals(TAGS, task.getTags());
    }

}