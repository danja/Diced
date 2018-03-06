package it.hyperdata.diced.model;

/**
 * Marker for the lifecycle stage of a {Task}
 * <p>
 * Created by danny on 06/03/18.
 */
public enum Status {
    /**
     * labels an active task
     */
    OPEN("Open"),


    /**
     * labels a task that has been completed
     */
    DONE("Done"),


    /**
     * labels a task that hasn't been completed but is currently inactive (hidden)
     */
    HOLD("Hold");

    private String name;

    Status(String name) {
        this.name = name;
    }

    /**
     * gets simple text for the status
     *
     * @return the text
     */
    public String asString() {
        return name;
    }
}
