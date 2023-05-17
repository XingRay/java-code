package com.xingray.project.maven.model;

import java.util.Map;

public class IssueManagement {
    private String system;

    private String url;

    private Map<Object, InputLocation> locations;

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
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
        return "IssueManagement{" +
                "system='" + system + '\'' +
                ", url='" + url + '\'' +
                ", locations=" + locations +
                '}';
    }
}
