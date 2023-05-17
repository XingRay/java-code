package com.xingray.project.maven.model;

import java.util.List;
import java.util.Map;

public class CiManagement {
    private String system;

    private String url;

    private List<Notifier> notifiers;


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

    public List<Notifier> getNotifiers() {
        return notifiers;
    }

    public void setNotifiers(List<Notifier> notifiers) {
        this.notifiers = notifiers;
    }

    public Map<Object, InputLocation> getLocations() {
        return locations;
    }

    public void setLocations(Map<Object, InputLocation> locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "CiManagement{" +
                "system='" + system + '\'' +
                ", url='" + url + '\'' +
                ", notifiers=" + notifiers +
                ", locations=" + locations +
                '}';
    }
}
