package it.hyperdata.diced.model;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import it.hyperdata.diced.model.simple.TaskBase;

/**
 * Have a setUp method that creates a tree structure and saves it to the DB
 * Let the setUp method create an in-memory copy of the tree with the following details per node: parent id, position, name
 * run each test function I want to test. E.g. move node from A to B
 * compare the in-memory to the new in-DB version. Propagate each diff found
 * assert that the diff changes are expected
 * <p>
 * empty tree
 * only right/left son
 * recursive move
 * leaf move
 * <p>
 * Created by danny on 17/03/18.
 */
public class TaskTreeTest {

    private static final int MAX_CHILDREN = 10;
    private static final int TOTAL_TASKS = 20;
    int calls = 0;
    private Random random = new Random();
    private int taskCount = 0;

    @Before
    public void setUp() throws Exception {
        // Log.d("test","Starting...");
        System.out.println("Starting...");
        Task root = new TaskBase();
        root.setId("0");
        root.setRoot(true);
        addChildren(root);

    }

    public void addChildren(Task parent) {
        System.out.println("calls = " + calls++);

        int nKids = random.nextInt(MAX_CHILDREN);
        System.out.println("nKids = " + nKids);
        for (int i = 0; i < nKids; i++) {
            System.out.println("kid = " + i);
            taskCount++;
            if (taskCount >= TOTAL_TASKS) break;
            Task child = new TaskBase();
            child.setId(Integer.toString(taskCount));
            parent.addChild(child);
            child.setParent(parent);
            addChildren(child);

            // Log.d("test",child.toTestString());
        }
        System.out.println(parent.toTestString());
    }

    @Test
    public void go() throws Exception {
        // Assert.assertEquals("Closed", Status.CLOSED.asString());
    }

}