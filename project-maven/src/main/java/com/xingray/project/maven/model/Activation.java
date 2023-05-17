package com.xingray.project.maven.model;

import java.util.Map;

public class Activation {
    private boolean activeByDefault;
    private String jdk;
    private ActivationOS os;
    private ActivationProperty property;
    private ActivationFile file;
    private java.util.Map<Object, InputLocation> locations;

    public boolean isActiveByDefault() {
        return activeByDefault;
    }

    public void setActiveByDefault(boolean activeByDefault) {
        this.activeByDefault = activeByDefault;
    }

    public String getJdk() {
        return jdk;
    }

    public void setJdk(String jdk) {
        this.jdk = jdk;
    }

    public ActivationOS getOs() {
        return os;
    }

    public void setOs(ActivationOS os) {
        this.os = os;
    }

    public ActivationProperty getProperty() {
        return property;
    }

    public void setProperty(ActivationProperty property) {
        this.property = property;
    }

    public ActivationFile getFile() {
        return file;
    }

    public void setFile(ActivationFile file) {
        this.file = file;
    }

    public Map<Object, InputLocation> getLocations() {
        return locations;
    }

    public void setLocations(Map<Object, InputLocation> locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "Activation{" +
                "activeByDefault=" + activeByDefault +
                ", jdk='" + jdk + '\'' +
                ", os=" + os +
                ", property=" + property +
                ", file=" + file +
                ", locations=" + locations +
                '}';
    }
}
