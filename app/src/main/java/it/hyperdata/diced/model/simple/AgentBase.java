package it.hyperdata.diced.model.simple;

import it.hyperdata.diced.model.Agent;

/**
 * Simple object representation of an Agent
 * <p>
 * Created by danny on 06/03/18.
 */
public class AgentBase implements Agent {
    private String id;
    private String name;
    private String nickname;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getNickname() {
        return nickname;
    }

    @Override
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
