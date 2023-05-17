package com.xingray.project.maven.model;

import java.util.Map;

public class License {
    private String name;

    /**
     * The official url for the license text.
     */
    private String url;

    /**
     *
     *
     *             The primary method by which this project may be
     * distributed.
     *             <dl>
     *               <dt>repo</dt>
     *               <dd>may be downloaded from the Maven
     * repository</dd>
     *               <dt>manual</dt>
     *               <dd>user must manually download and install
     * the dependency.</dd>
     *             </dl>
     *
     *
     */
    private String distribution;

    /**
     * Addendum information pertaining to this license.
     */
    private String comments;

    /**
     * Field locations.
     */
    private java.util.Map<Object, InputLocation> locations;

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

    public String getDistribution() {
        return distribution;
    }

    public void setDistribution(String distribution) {
        this.distribution = distribution;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Map<Object, InputLocation> getLocations() {
        return locations;
    }

    public void setLocations(Map<Object, InputLocation> locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "License{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", distribution='" + distribution + '\'' +
                ", comments='" + comments + '\'' +
                ", locations=" + locations +
                '}';
    }
}
