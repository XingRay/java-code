package com.xingray.project.maven.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class ModelBase {
    private List<String> modules;

    private DistributionManagement distributionManagement;

    private java.util.Properties properties;

    private DependencyManagement dependencyManagement;

    private List<Dependency> dependencies;

    private List<Repository> repositories;

    private List<Repository> pluginRepositories;

    private Reporting reporting;

    private Map<Object, InputLocation> locations;

    public List<String> getModules() {
        return modules;
    }

    public void setModules(List<String> modules) {
        this.modules = modules;
    }

    public DistributionManagement getDistributionManagement() {
        return distributionManagement;
    }

    public void setDistributionManagement(DistributionManagement distributionManagement) {
        this.distributionManagement = distributionManagement;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public DependencyManagement getDependencyManagement() {
        return dependencyManagement;
    }

    public void setDependencyManagement(DependencyManagement dependencyManagement) {
        this.dependencyManagement = dependencyManagement;
    }

    public List<Dependency> getDependencies() {
        return dependencies;
    }

    public void setDependencies(List<Dependency> dependencies) {
        this.dependencies = dependencies;
    }

    public List<Repository> getRepositories() {
        return repositories;
    }

    public void setRepositories(List<Repository> repositories) {
        this.repositories = repositories;
    }

    public List<Repository> getPluginRepositories() {
        return pluginRepositories;
    }

    public void setPluginRepositories(List<Repository> pluginRepositories) {
        this.pluginRepositories = pluginRepositories;
    }

    public Reporting getReporting() {
        return reporting;
    }

    public void setReporting(Reporting reporting) {
        this.reporting = reporting;
    }

    public Map<Object, InputLocation> getLocations() {
        return locations;
    }

    public void setLocations(Map<Object, InputLocation> locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "ModelBase{" +
                "modules=" + modules +
                ", distributionManagement=" + distributionManagement +
                ", properties=" + properties +
                ", dependencyManagement=" + dependencyManagement +
                ", dependencies=" + dependencies +
                ", repositories=" + repositories +
                ", pluginRepositories=" + pluginRepositories +
                ", reporting=" + reporting +
                ", locations=" + locations +
                '}';
    }
}
