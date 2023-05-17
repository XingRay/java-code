package com.xingray.project.maven.model;

import java.util.List;

public class BuildBase extends PluginConfiguration{
    private String defaultGoal;

    private java.util.List<Resource> resources;

    private java.util.List<Resource> testResources;

    private String directory;

    private String finalName;

    private java.util.List<String> filters;

    public String getDefaultGoal() {
        return defaultGoal;
    }

    public void setDefaultGoal(String defaultGoal) {
        this.defaultGoal = defaultGoal;
    }

    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    public List<Resource> getTestResources() {
        return testResources;
    }

    public void setTestResources(List<Resource> testResources) {
        this.testResources = testResources;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public String getFinalName() {
        return finalName;
    }

    public void setFinalName(String finalName) {
        this.finalName = finalName;
    }

    public List<String> getFilters() {
        return filters;
    }

    public void setFilters(List<String> filters) {
        this.filters = filters;
    }

    @Override
    public String toString() {
        return "BuildBase{" +
                "defaultGoal='" + defaultGoal + '\'' +
                ", resources=" + resources +
                ", testResources=" + testResources +
                ", directory='" + directory + '\'' +
                ", finalName='" + finalName + '\'' +
                ", filters=" + filters +
                "} " + super.toString();
    }
}
