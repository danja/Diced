package it.hyperdata.diced.model;

import org.junit.Before;
import org.junit.Test;

import it.hyperdata.diced.model.simple.AgentBase;

import static org.junit.Assert.assertEquals;

/**
 * Created by danny on 15/03/18.
 */
public class AgentTest {

    Agent agent;
    String ID;
    String NAME;
    String NICKNAME;

    @Before
    public void setUp() throws Exception {

        agent = new AgentBase();
        ID = "http://the-id";
        NAME = "Ford Prefect";
        NICKNAME = "fp";
    }

    @Test
    public void testSetGetId() throws Exception {
        agent.setId(ID);
        assertEquals(ID, agent.getId());
    }

    @Test
    public void testSetGetName() throws Exception {
        agent.setName(NAME);
        assertEquals(NAME, agent.getName());
    }

    @Test
    public void testSetGetNickname() throws Exception {
        agent.setNickname(NICKNAME);
        assertEquals(NICKNAME, agent.getNickname());
    }
}