package com.xingray.project.maven.model;

public class Profile extends ModelBase{
    private String id;

    private Activation activation;

    /**
     * Information required to build the project.
     */
    private BuildBase build;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Activation getActivation() {
        return activation;
    }

    public void setActivation(Activation activation) {
        this.activation = activation;
    }

    public BuildBase getBuild() {
        return build;
    }

    public void setBuild(BuildBase build) {
        this.build = build;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id='" + id + '\'' +
                ", activation=" + activation +
                ", build=" + build +
                '}';
    }
}
