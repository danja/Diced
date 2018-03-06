package it.hyperdata.diced.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by danny on 06/03/18.
 */
public class StatusTest {
    @Test
    public void stringValueWorks() throws Exception {
        assertEquals("Done", Status.DONE.asString());
    }
}