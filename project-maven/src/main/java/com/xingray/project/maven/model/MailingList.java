package com.xingray.project.maven.model;

import java.util.List;
import java.util.Map;

public class MailingList {
    private String name;

    private String subscribe;

    private String unsubscribe;

    private String post;

    private String archive;

    private java.util.List<String> otherArchives;

    private java.util.Map<Object, InputLocation> locations;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(String subscribe) {
        this.subscribe = subscribe;
    }

    public String getUnsubscribe() {
        return unsubscribe;
    }

    public void setUnsubscribe(String unsubscribe) {
        this.unsubscribe = unsubscribe;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getArchive() {
        return archive;
    }

    public void setArchive(String archive) {
        this.archive = archive;
    }

    public List<String> getOtherArchives() {
        return otherArchives;
    }

    public void setOtherArchives(List<String> otherArchives) {
        this.otherArchives = otherArchives;
    }

    public Map<Object, InputLocation> getLocations() {
        return locations;
    }

    public void setLocations(Map<Object, InputLocation> locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "MailingList{" +
                "name='" + name + '\'' +
                ", subscribe='" + subscribe + '\'' +
                ", unsubscribe='" + unsubscribe + '\'' +
                ", post='" + post + '\'' +
                ", archive='" + archive + '\'' +
                ", otherArchives=" + otherArchives +
                ", locations=" + locations +
                '}';
    }
}
