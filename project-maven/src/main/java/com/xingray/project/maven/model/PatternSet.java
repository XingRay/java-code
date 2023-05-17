package com.xingray.project.maven.model;

import java.util.List;
import java.util.Map;

public class PatternSet {
    private java.util.List<String> includes;

    private java.util.List<String> excludes;

    private java.util.Map<Object, InputLocation> locations;

    public List<String> getIncludes() {
        return includes;
    }

    public void setIncludes(List<String> includes) {
        this.includes = includes;
    }

    public List<String> getExcludes() {
        return excludes;
    }

    public void setExcludes(List<String> excludes) {
        this.excludes = excludes;
    }

    public Map<Object, InputLocation> getLocations() {
        return locations;
    }

    public void setLocations(Map<Object, InputLocation> locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "PatternSet{" +
                "includes=" + includes +
                ", excludes=" + excludes +
                ", locations=" + locations +
                '}';
    }
}
