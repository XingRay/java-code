package com.xingray.project.maven.model;

public class PluginConfiguration extends PluginContainer{
    private PluginManagement pluginManagement;

    public PluginManagement getPluginManagement() {
        return pluginManagement;
    }

    public void setPluginManagement(PluginManagement pluginManagement) {
        this.pluginManagement = pluginManagement;
    }

    @Override
    public String toString() {
        return "PluginConfiguration{" +
                "pluginManagement=" + pluginManagement +
                "} " + super.toString();
    }
}
