package com.xingray.project.maven.model;

public class InputSource {
    private String modelId;
    private String location;

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "InputSource{" +
                "modelId='" + modelId + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
