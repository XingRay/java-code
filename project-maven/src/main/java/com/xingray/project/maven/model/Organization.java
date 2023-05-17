package com.xingray.project.maven.model;

import java.util.Map;

public class Organization {
    private String name;

    private String url;

    private java.util.Map<Object, InputLocation> locations;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Map<Object, InputLocation> getLocations() {
        return locations;
    }

    public void setLocations(Map<Object, InputLocation> locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", locations=" + locations +
                '}';
    }
}
