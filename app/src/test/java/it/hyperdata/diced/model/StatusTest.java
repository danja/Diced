package it.hyperdata.diced.model;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by danny on 06/03/18.
 */
public class StatusTest {
    @Test
    public void stringValueWorks() throws Exception {
        Assert.assertEquals("Closed", Status.CLOSED.asString());
    }
}