package com.xingray.project.maven.model;

import java.util.Map;

public class ConfigurationContainer {
    private String inherited;
    private Object configuration;

    private Map<Object, InputLocation> locations;

    public String getInherited() {
        return inherited;
    }

    public void setInherited(String inherited) {
        this.inherited = inherited;
    }

    public Object getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Object configuration) {
        this.configuration = configuration;
    }

    public Map<Object, InputLocation> getLocations() {
        return locations;
    }

    public void setLocations(Map<Object, InputLocation> locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "ConfigurationContainer{" +
                "inherited='" + inherited + '\'' +
                ", configuration=" + configuration +
                ", locations=" + locations +
                '}';
    }
}
