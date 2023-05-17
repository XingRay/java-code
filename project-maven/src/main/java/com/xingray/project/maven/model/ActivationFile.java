package com.xingray.project.maven.model;

import java.util.Map;

public class ActivationFile {
    private String missing;

    private String exists;

    private Map<Object, InputLocation> locations;

    public String getMissing() {
        return missing;
    }

    public void setMissing(String missing) {
        this.missing = missing;
    }

    public String getExists() {
        return exists;
    }

    public void setExists(String exists) {
        this.exists = exists;
    }

    public Map<Object, InputLocation> getLocations() {
        return locations;
    }

    public void setLocations(Map<Object, InputLocation> locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "ActivationFile{" +
                "missing='" + missing + '\'' +
                ", exists='" + exists + '\'' +
                ", locations=" + locations +
                '}';
    }
}
