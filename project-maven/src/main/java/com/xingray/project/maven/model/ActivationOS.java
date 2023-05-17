package com.xingray.project.maven.model;

import java.util.Map;

public class ActivationOS {
    private String name;

    private String family;

    private String arch;

    private String version;

    private java.util.Map<Object, InputLocation> locations;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Map<Object, InputLocation> getLocations() {
        return locations;
    }

    public void setLocations(Map<Object, InputLocation> locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "ActivationOS{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", arch='" + arch + '\'' +
                ", version='" + version + '\'' +
                ", locations=" + locations +
                '}';
    }
}
