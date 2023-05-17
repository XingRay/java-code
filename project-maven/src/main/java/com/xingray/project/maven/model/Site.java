package com.xingray.project.maven.model;

import java.util.Map;

public class Site {
    private String id;

    private String name;

    private String url;

    private String childInheritAppendPath;

    private Map<Object, InputLocation> locations;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getChildInheritAppendPath() {
        return childInheritAppendPath;
    }

    public void setChildInheritAppendPath(String childInheritAppendPath) {
        this.childInheritAppendPath = childInheritAppendPath;
    }

    public Map<Object, InputLocation> getLocations() {
        return locations;
    }

    public void setLocations(Map<Object, InputLocation> locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "Site{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", childInheritAppendPath='" + childInheritAppendPath + '\'' +
                ", locations=" + locations +
                '}';
    }
}
