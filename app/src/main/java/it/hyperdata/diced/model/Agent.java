package it.hyperdata.diced.model;

/**
 * Represents an agent responsible for tasks. Typically a person.
 * <p>
 * Created by danny on 06/03/18.
 */

public interface Agent {

    /**
     * a unique identifier for the Agent
     *
     * @return the id
     */
    public String getId();

    /**
     * a unique identifier for the Agent
     *
     * @param id the id
     */
    public void setId(String id);

    /**
     * full name of the Agent
     *
     * @return the name
     */
    public String getName();

    /**
     * full name of the Agent
     *
     * @param name the name
     */
    public void setName(String name);

    /**
     * short name of the Agent
     *
     * @return the nickname
     */
    public String getNickname();

    /**
     * short name of the Agent
     *
     * @param nickname the nickname
     */
    public void setNickname(String nickname);
}
