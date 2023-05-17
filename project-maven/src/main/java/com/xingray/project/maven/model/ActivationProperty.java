package com.xingray.project.maven.model;

import java.util.Map;

public class ActivationProperty {
    private String name;

    /**
     * The value of the property required to activate a profile.
     */
    private String value;

    /**
     * Field locations.
     */
    private java.util.Map<Object, InputLocation> locations;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Map<Object, InputLocation> getLocations() {
        return locations;
    }

    public void setLocations(Map<Object, InputLocation> locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "ActivationProperty{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", locations=" + locations +
                '}';
    }
}
