package it.hyperdata.diced.model;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import it.hyperdata.diced.model.simple.TaskBase;

import static org.junit.Assert.assertEquals;

/**
 * Created by danny on 07/03/18.
 */
public class SimpleTaskTest {

    Task task;

    String ID;
    String PARENT;
    char INDEX;
    LocalDateTime CREATED;
    LocalDateTime HELD;
    LocalDateTime CLOSED;
    Set<String> TAGS;
    String NEW_TAG;
    String TITLE;
    String DESCRIPTION;
    Status STATUS_OPEN;
    Status STATUS_HELD;
    Status STATUS_CLOSED;

    @Before
    public void setUp() throws Exception {
        task = new TaskBase();

        ID = "http://test";
        TITLE = "a task";
        DESCRIPTION = "a dummy task";
        STATUS_OPEN = Status.OPEN;
        STATUS_HELD = Status.HELD;
        STATUS_CLOSED = Status.CLOSED;
        TAGS = new HashSet<>(Arrays.asList("one", "two", "three"));
        NEW_TAG = "four";
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
        task.setTitle(DESCRIPTION);
        assertEquals(DESCRIPTION, task.getTitle());
    }

    @Test
    public void testStatus() throws Exception {
        throw new Exception();
        // TODO
    }

    @Test
    public void testTags() throws Exception {
        throw new Exception();
        // TODO
    }

}