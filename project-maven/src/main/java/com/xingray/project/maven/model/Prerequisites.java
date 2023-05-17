package com.xingray.project.maven.model;

import java.util.Map;

public class Prerequisites {
    private String maven;

    private java.util.Map<Object, InputLocation> locations;

    public String getMaven() {
        return maven;
    }

    public void setMaven(String maven) {
        this.maven = maven;
    }

    public Map<Object, InputLocation> getLocations() {
        return locations;
    }

    public void setLocations(Map<Object, InputLocation> locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "Prerequisites{" +
                "maven='" + maven + '\'' +
                ", locations=" + locations +
                '}';
    }
}
