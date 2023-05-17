package com.xingray.project.maven.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Contributor {
    private String name;

    /**
     * The email address of the contributor.
     */
    private String email;

    /**
     * The URL for the homepage of the contributor.
     */
    private String url;

    /**
     * The organization to which the contributor belongs.
     */
    private String organization;

    /**
     * The URL of the organization.
     */
    private String organizationUrl;

    /**
     * Field roles.
     */
    private java.util.List<String> roles;

    /**
     * The timezone the contributor is in. Typically,
     * this is a number in the range
     * <a
     * href="http://en.wikipedia.org/wiki/UTC%E2%88%9212:00">-12</a>
     * to <a
     * href="http://en.wikipedia.org/wiki/UTC%2B14:00">+14</a>
     * or a valid time zone id like
     * "America/Montreal" (UTC-05:00) or "Europe/Paris"
     * (UTC+01:00).
     */
    private String timezone;

    /**
     * Field properties.
     */
    private java.util.Properties properties;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getOrganizationUrl() {
        return organizationUrl;
    }

    public void setOrganizationUrl(String organizationUrl) {
        this.organizationUrl = organizationUrl;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Map<Object, InputLocation> getLocations() {
        return locations;
    }

    public void setLocations(Map<Object, InputLocation> locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "Contributor{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", url='" + url + '\'' +
                ", organization='" + organization + '\'' +
                ", organizationUrl='" + organizationUrl + '\'' +
                ", roles=" + roles +
                ", timezone='" + timezone + '\'' +
                ", properties=" + properties +
                ", locations=" + locations +
                '}';
    }
}
