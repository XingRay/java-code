package com.xingray.project.maven.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.*;

public class Plugin {
    private String groupId;
    private String artifactId;
    private String version;
    private Map<String, Object> configuration;

    @JacksonXmlElementWrapper(localName = "executions")
    @JacksonXmlProperty(localName = "execution")
    private List<Execution> executions;

    public Plugin() {
    }

    public Plugin(String groupId, String artifactId, String version) {
        this.groupId = groupId;
        this.artifactId = artifactId;
        this.version = version;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Map<String, Object> getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Map<String, Object> configuration) {
        this.configuration = configuration;
    }

    public List<Execution> getExecutions() {
        return executions;
    }

    public void setExecutions(List<Execution> executions) {
        this.executions = executions;
    }

    @Override
    public String toString() {
        return "Plugin{" +
                "groupId='" + groupId + '\'' +
                ", artifactId='" + artifactId + '\'' +
                ", version='" + version + '\'' +
                ", configuration=" + configuration +
                ", executions=" + executions +
                '}';
    }

    public static Plugin ofGav(String gav) {
        String[] split = gav.split(":");
        return new Plugin(split[0], split[1], split[2]);
    }

    public Configuration configuration() {
        if (configuration == null) {
            configuration = new HashMap<>();
        }
        return new Configuration(this, null, configuration);
    }

    public Plugin addExecution(String phase, String... goals) {
        if (executions == null) {
            executions = new ArrayList<>();
        }
        Execution execution = new Execution();
        execution.setPhase(phase);
        execution.setGoals(Arrays.asList(goals));
        executions.add(execution);

        return this;
    }

    public static class Configuration {
        private final Map<String, Object> configuration;
        public final Configuration parent;
        private final Plugin plugin;

        public Configuration(Plugin plugin, Configuration parent, Map<String, Object> configuration) {
            this.parent = parent;
            this.configuration = configuration;
            this.plugin = plugin;
        }

        public Configuration addAndGetChild(String name) {
            HashMap<String, Object> childMap = new HashMap<>();
            configuration.put(name, childMap);
            return new Configuration(plugin, this, childMap);
        }

        public Configuration put(String key, Object value) {
            configuration.put(key, value);
            return this;
        }

        public Configuration parent() {
            return parent;
        }

        public Plugin plugin() {
            return plugin;
        }

        @Override
        public String toString() {
            return "Configuration{" +
                    "configuration=" + configuration +
                    ", parent=" + parent.hashCode() +
                    '}';
        }
    }
}
