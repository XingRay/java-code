package com.xingray.project.maven.model;

import java.util.Map;

public class SourceControlManagement {
    private String connection;

    private String developerConnection;

    private String tag;

    private String url;

    private String childInheritAppendPath;

    private java.util.Map<Object, InputLocation> locations;

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public String getDeveloperConnection() {
        return developerConnection;
    }

    public void setDeveloperConnection(String developerConnection) {
        this.developerConnection = developerConnection;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
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
        return "SourceControlManagement{" +
                "connection='" + connection + '\'' +
                ", developerConnection='" + developerConnection + '\'' +
                ", tag='" + tag + '\'' +
                ", url='" + url + '\'' +
                ", childInheritAppendPath='" + childInheritAppendPath + '\'' +
                ", locations=" + locations +
                '}';
    }
}
