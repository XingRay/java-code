package com.xingray.project.maven.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;
import java.util.Properties;

@JacksonXmlRootElement(localName = "project")
@JsonIgnoreProperties(ignoreUnknown = true, value = {"schemaLocation"})
@JsonPropertyOrder({"modelVersion", "groupId", "artifactId", "version", "properties", "dependencyManagement", "dependencies", "build"})
public class MavenProject extends Model {

    @JacksonXmlProperty(isAttribute = true, localName = "xmlns")
    private String xmlns = "http://maven.apache.org/POM/4.0.0";

    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:xsi")
    private String xsi = "http://www.w3.org/2001/XMLSchema-instance";

    @JacksonXmlProperty(isAttribute = true, localName = "xsi:schemaLocation")
    private String schemaLocation = "http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd";

    private String modelVersion = "4.0.0";

    @JacksonXmlElementWrapper(localName = "models")
    @JacksonXmlProperty(localName = "model")
    private List<String> modules;

    @JacksonXmlElementWrapper(localName = "dependencies")
    @JacksonXmlProperty(localName = "dependency")
    private List<Dependency> dependencies;
    private DependencyManagement dependencyManagement;

    private Properties properties;

    private Build build;

    public String getXmlns() {
        return xmlns;
    }

    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    public String getXsi() {
        return xsi;
    }

    public void setXsi(String xsi) {
        this.xsi = xsi;
    }

    public String getSchemaLocation() {
        return schemaLocation;
    }

    public void setSchemaLocation(String schemaLocation) {
        this.schemaLocation = schemaLocation;
    }

    public String getModelVersion() {
        return modelVersion;
    }

    public void setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
    }

    public Build getBuild() {
        return build;
    }

    public void setBuild(Build build) {
        this.build = build;
    }

    public List<String> getModules() {
        return modules;
    }

    public void setModules(List<String> modules) {
        this.modules = modules;
    }

    public List<Dependency> getDependencies() {
        return dependencies;
    }

    public void setDependencies(List<Dependency> dependencies) {
        this.dependencies = dependencies;
    }

    public DependencyManagement getDependencyManagement() {
        return dependencyManagement;
    }

    public void setDependencyManagement(DependencyManagement dependencyManagement) {
        this.dependencyManagement = dependencyManagement;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "MavenProject{" +
                "xmlns='" + xmlns + '\'' +
                ", xsi='" + xsi + '\'' +
                ", schemaLocation='" + schemaLocation + '\'' +
                ", modelVersion='" + modelVersion + '\'' +
                ", modules=" + modules +
                ", dependencies=" + dependencies +
                ", dependencyManagement=" + dependencyManagement +
                ", properties=" + properties +
                ", build=" + build +
                "} " + super.toString();
    }

    public MavenProject() {
    }

    public MavenProject(String groupId, String artifactId, String version) {
        setGroupId(groupId);
        setArtifactId(artifactId);
        setVersion(version);
    }

    public static MavenProject ofGav(String[] gav) {
        return new MavenProject(gav[0], gav[1], gav[2]);
    }

    public static MavenProject ofGav(String gav) {
        return ofGav(gav.split(":"));
    }

    public MavenProject addProperty(String key, String value) {
        if (properties == null) {
            properties = new Properties();
        }
        properties.put(key, value);
        return this;
    }

    public Build build() {
        if (build == null) {
            build = new Build();
        }
        return build;
    }
}
